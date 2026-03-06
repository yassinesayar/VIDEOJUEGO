package app;

import Vista.Vista;
import Modelo.Personaje;
import Modelo.Tipos_de_Personajes.*;

public class main {

    public static void main(String[] args) {

        Vista vista = new Vista();

        int opcion = vista.mostarMenu();

        // FIX: pedir nombre al usuario antes de crear el personaje
        String nombre = vista.pedirNombre();

        Personaje jugador = null;

        switch (opcion) {
            case 1:
                jugador = new Guerrero(nombre, 120, 1, 25, 15);
                break;
            case 2:
                jugador = new Mago(nombre, 80, 1, 100, "FireBall");
                break;
            case 3:
                jugador = new Asesino(nombre, 90, 1, 30, 5);
                break;
            case 4:
                jugador = new Curandero(nombre, 100, 1, 120, "Heal");
                break;
            case 5:
                jugador = new Arquero(nombre, 100, 1, 20, 5, 10);
                break;
            default:
                vista.mostrarMensaje("Opcion no valida. Se crea Guerrero por defecto.");
                // FIX: usar 'nombre' que ya fue pedido arriba
                jugador = new Guerrero(nombre, 120, 1, 25, 15);
        }

        Personaje enemigo = new Guerrero("Enemigo", 100, 1, 20, 10);

        vista.mostrarMensaje("Empieza el combate!");
        vista.mostrarEnemigo(enemigo);

        while (jugador.getSalud() > 0 && enemigo.getSalud() > 0) {

            vista.mostarEstadoDeCombate(jugador, enemigo);

            int accion = vista.turnos();

            switch (accion) {
                case 1:
                    jugador.atacar();
                    enemigo.setSalud(enemigo.getSalud() - 10);
                    break;
                case 2:
                    vista.mostrarMensaje("Habilidad usada.");
                    break;
                case 3:
                    vista.mostrarMensaje("Turno pasado.");
                    break;
            }

            if (enemigo.getSalud() > 0) {
                enemigo.atacar();
                jugador.setSalud(jugador.getSalud() - 10);
            }
        }

        if (jugador.getSalud() > 0) {
            vista.mostrarVictoria();
        } else {
            vista.mostrarDerrota();
        }
    }
}
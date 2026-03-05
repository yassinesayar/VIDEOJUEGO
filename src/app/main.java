package app;

import Vista.Vista;
import Modelo.Personaje;
import Modelo.Tipos_de_Personajes.*;

public class main {

    public static void main(String[] args) {

        Vista vista = new Vista();

        // Elegir personaje
        int opcion = vista.mostarMenu();



        Personaje jugador = null;

        // Crear personaje según la opción
        switch (opcion) {

            case 1:
                jugador = new Guerrero("Asta", 120, 1, 25, 15);
                break;

            case 2:
                jugador = new Mago("Fuegoleon Vermillion", 80, 1, 100, "FireBall");
                break;

            case 3:
                jugador = new Asesino("Kenny Ackerman", 90, 1, 30, 5);
                break;

            case 4:
                jugador = new Curandero("Mimosa Vermillion", 100, 1, 120, "Heal");
                break;

            case 5:
                jugador = new Arquero("Neia Baraja", 100, 1, 20, 5, 10);
                break;

            default:
                vista.mostrarMensaje("Opción no válida. Se crea Guerrero por defecto.");
                jugador = new Guerrero(nombre, 120, 1, 25, 15);
        }

        // Enemigo simple
        Personaje enemigo = new Guerrero("Enemigo", 100, 1, 20, 10);

        vista.mostrarMensaje("¡Empieza el combate!");
        vista.mostrarEnemigo(enemigo);

        // Combate
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

            // Turno enemigo
            if (enemigo.getSalud() > 0) {
                enemigo.atacar();
                jugador.setSalud(jugador.getSalud() - 10);
            }
        }

        // Resultado
        if (jugador.getSalud() > 0) {
            vista.mostrarVictoria();
        } else {
            vista.mostrarDerrota();
        }
    }
}
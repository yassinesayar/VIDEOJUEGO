package Vista;

import Modelo.Personaje;
import java.util.Scanner;

public class Vista {
    private Scanner sc = new Scanner(System.in);

    public int mostarMenu() {
        System.out.println("____________________________");
        System.out.println("     Bienvenido Jugador     ");
        System.out.println("____________________________");
        System.out.println(" -- DECIDA UN PERSONAJE --  ");
        System.out.println(" 1  Guerrero: Fuerte y valiente, experto en combate fisico.");
        System.out.println(" 2  Mago: Especializado en conocimientos arcanos.");
        System.out.println(" 3  Asesino: Veloz ejecutor con ataques potentes pero poca vida.");
        System.out.println(" 4  Curandero: Bondadoso y paciente, definicion perfecta de aguante.");
        System.out.println(" 5  Arquero: Rapido y dificil de atrapar.");
        System.out.println(" Cual decides que te acompane en tu aventura?");
        return sc.nextInt();
    }

    public String pedirNombre() {
        sc.nextLine();
        System.out.println("Que nombre se le otorgara a tu personaje?:");
        return sc.nextLine();
    }

    public void mostarEstadoDeCombate(Personaje jugador, Personaje enemigo) {
        System.out.println(" ---- ESTADO DEL COMBATE ---- ");
        System.out.println("Jugador: " + jugador.getNombre());
        System.out.println(" | Salud: " + jugador.getSalud());
        System.out.println(" | Nivel: " + jugador.getNivel());
        System.out.println("------------------------------");
        System.out.println("Enemigo: " + enemigo.getNombre());
        System.out.println(" | Salud: " + enemigo.getSalud());
        System.out.println(" | Nivel: " + enemigo.getNivel());
    }

    public int turnos() {
        System.out.println("Que quiere hacer?");
        System.out.println(" 1 Atacar");
        System.out.println(" 2 Habilidad");
        System.out.println(" 3 Pasar");
        return sc.nextInt();
    }

    public void mostrarVictoria() {
        System.out.println("Has derrotado al enemigo!");
    }

    public void mostrarDerrota() {
        System.out.println("Has muerto... Fin del juego.");
    }

    public String preguntarContinuar() {
        sc.nextLine();
        System.out.println("Deseas pelear mas? (S/N)");
        return sc.nextLine();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarAtaque(Personaje atacante, Personaje objetivo, double dano) {
        System.out.println(atacante.getNombre() + " ataca a " + objetivo.getNombre() + " causando " + dano + " de dano.");
    }

    public void mostrarSubidaNivel(Personaje jugador, double exp) {
        System.out.println(jugador.getNombre() + " gana " + exp + " de experiencia.");
        if (jugador.getExperiencia() == 0) {
            System.out.println("!" + jugador.getNombre() + " ha subido al nivel " + jugador.getNivel() + "!");
        }
    }

    public void mostrarEnemigo(Personaje enemigo) {
        System.out.println("\nAparece un enemigo!");
        System.out.println(enemigo);
    }

    public void mostrarHechizo(Personaje magico, String hechizo, double dano, Personaje objetivo) {
        System.out.println(magico.getNombre() + " lanza " + hechizo + " a " + objetivo.getNombre() + " causando " + dano + " de dano.");
    }

    public void mostrarCurar(Personaje curandero, Personaje objetivo, double cantidadCuracion) {
        System.out.println(curandero.getNombre() + " cura a " + objetivo.getNombre()
                + " restaurando " + cantidadCuracion + " de salud.");
    }

    public void mostrarSigilo(Personaje asesino) {
        System.out.println(asesino.getNombre() + " entra en sigilo y prepara un ataque sorpresa.");
    }

    public void mostrarDefensa(Personaje defensor) {
        System.out.println(defensor.getNombre() + " se defiende reduciendo el dano del proximo ataque.");
    }

    public void mostrarFlechas(Personaje arquero, Personaje objetivo, double dano) {
        System.out.println(arquero.getNombre() + " dispara una flecha a " + objetivo.getNombre()
                + " causando " + dano + " de dano.");
    }
}
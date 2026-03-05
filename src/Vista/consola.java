package Vista;

import java.util.Scanner;

public class Vista {
    private Scanner sc = new Scanner (System.in);

    public class mostarMenu() {
        System.out.println("____________________________");
        System.out.println("     Bienvenido Jugador     ");
        System.out.println("____________________________");
        System.out.println(" -- DECIDA UN PERSONAJE --  ");
        System.out.println(" 1º  Guerrero : ");
        System.out.println(" -- Fuerte y valiente, experto en combate físico.");
        System.out.println(" 2º Mago : ");
        System.out.println(" -- Especializado en años de conocimientos arcanos.");
        System.out.println(" 3º Asesino :");
        System.out.println(" -- Un veloz ejecutor con ataques potentes pero poca vida");
        System.out.println(" 4º Curandero :");
        System.out.println(" -- Bondadoso y paciente , la definicion perfecta de aguante");
        System.out.println(" 5º Arquero :");
        System.out.println(" -- Rapido y dificil de atrapar pocos lo logran ver");
        System.out.println(" Cual decides que te acompañe en tu aventura");
        return sc.nextInt();
    }


public class pedirNombre() {
        sc.nextLine();
        System.out.println("Que nombre se le otorgara a tu personaje? :")
        return sc.nextLine();
}


public class mostarEstadoDeCombate(Personaje Jugador , Personaje Enemigo) {
System.out.println(" ---- ESTADO DEL COMBATE ---- ");
System.out.println("Jugador " + Jugador.getNombre());
System.out.println(" | Salud " + Personaje.getSalud());
System.out.println(" | Nivel " + Personaje.getNivel());
System.out.println("------------------------------");
System.out.println("Enemigo " + Enemigo.getNombre());
System.out.println(" | Salud " + Enemigo.getSalud());
System.out.println(" | Nivel " + Enemigo.getNivel());
}

public int turnos() {

        System.out.println("¿Que quiere hacer?");
        System.out.println(" 1º Atacar");
        System.out.println(" 2  Habilidad");
        System.out.println(" 3  Pasar");
}


    public void mostrarVictoria(){
        System.out.println("¡Has derrotado al enemigo!");
    }

    public void mostrarDerrota(){
        System.out.println("Has muerto... Fin del juego.");
    }



    public class String preguntarContinuar() {
        sc.nextLine();
        System.out.println("¿Deseas pelear más? (S/N)");
        return sc.nextLine();
        }

        public class mostrarMensaje(String mensaje) {
            System.out.println(mensaje);
        }




        public class mostrarAtaque(Personaje atacante, Personaje objetivo, double daño) {
            System.out.println(atacante.getNombre() + " ataca a " + objetivo.getNombre() + " causando " + daño + " de daño.");
        }

        // ----- Mostrar experiencia y subida de nivel -----
        public class mostrarSubidaNivel(Personaje jugador, double exp) {
            System.out.println(jugador.getNombre() + " gana " + exp + " de experiencia.");
            if (jugador.getExperiencia() == 0) {
                System.out.println("¡" + jugador.getNombre() + " ha subido al nivel " + jugador.getNivel() + "!");
            }
        }


        public class mostrarEnemigo(Personaje enemigo) {
            System.out.println("\n¡Aparece un enemigo!");
            System.out.println(enemigo);
        }

        // ----- Mostrar ataque especial o hechizo -----
        public class mostrarHechizo(Personaje magico, String hechizo, double daño, Personaje objetivo) {
            System.out.println(magico.getNombre() + " lanza " + hechizo + " a " + objetivo.getNombre() + " causando " + daño + " de daño.");
        }

    public class mostrarCurar(Personaje curandero, Personaje objetivo, double cantidadCuracion) {
    System.out.println(curandero.getNombre() + " cura a " + objetivo.getNombre()
            + " restaurando "

    }

    public void mostrarSigilo(Personaje asesino) {
        System.out.println(asesino.getNombre() + " entra en sigilo y prepara un ataque sorpresa.");
    }

    public void mostrarDefensa(Personaje defensor) {
        System.out.println(defensor.getNombre() + " se defiende reduciendo el daño del próximo ataque.");
    }

    public void mostrarFlechas(Personaje arquero, Personaje objetivo, double daño) {
        System.out.println(arquero.getNombre() + " dispara una flecha a " + objetivo.getNombre()
                + " causando " + daño + " de daño.");
    }


    }

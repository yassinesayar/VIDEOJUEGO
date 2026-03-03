package Modelo.Tipos_de_Personajes;
import Modelo.PersonajeFisico;

public class Arquero extends PersonajeFisico {
    private int flechas;

    public Arquero(String Nombre, double Salud, double Nivel, int fuerza, int armadura, int flechas) {
        super(Nombre, Salud, Nivel, fuerza, armadura);
        this.flechas = flechas;
    }

    @Override
    public void atacar() {
        if (flechas > 0) {
            System.out.println(getNombre() + " dispara una flecha.");
            flechas--;
        } else {
            System.out.println(getNombre() + " no tiene flechas.");
        }
    }
}
package Modelo.Tipos_de_Personajes;

import Modelo.PersonajeFisico;
import Modelo.Interfaces.Sigilo;

public class Asesino extends PersonajeFisico implements Sigilo {

    public Asesino(String Nombre, double Salud, double Nivel, int fuerza, int armadura) {
        super(Nombre, Salud, Nivel, fuerza, armadura);
    }

    @Override
    public void atacar() {
        System.out.println(getNombre() + " ataca rápidamente.");
    }

    @Override
    public void Sigilo() {
        System.out.println(getNombre() + " desaparece en las sombras.");
    }
}
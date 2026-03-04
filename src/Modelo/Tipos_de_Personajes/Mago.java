package Modelo.Tipos_de_Personajes;

import Modelo.PersonajeMagico;

public class Mago extends PersonajeMagico {

    public Mago(String Nombre, double Salud, double Nivel, double Mana, String Hechizo) {
        super(Nombre, Salud, Nivel, Mana, Hechizo);
    }

    @Override
    public void atacar() {
        System.out.println(getNombre() + " lanza su hechizo: " + getHechizo());
    }
}
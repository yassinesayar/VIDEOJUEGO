package Modelo.Tipos_de_Personajes;

import Modelo.Personaje;
import Modelo.PersonajeMagico;
import Modelo.Interfaces.Curacion;
import Modelo.Interfaces.Sigilo;

public class Curandero extends PersonajeMagico implements Curacion, Sigilo {

    public Curandero(String Nombre, double Salud, double Nivel, double Mana, String Hechizo) {
        super(Nombre, Salud, Nivel, Mana, Hechizo);
    }

    @Override
    public void atacar() {
        System.out.println(getNombre() + " lanza un destello cegador.");
    }

    @Override
    public void curar(Personaje objetivo) {
        System.out.println(getNombre() + " sana las heridas de " + objetivo.getNombre());
    }

    @Override
    public void Sigilo() {
        System.out.println(getNombre() + " se oculta tras un aura de luz.");
    }
}
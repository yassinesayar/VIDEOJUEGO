package Modelo.Tipos_de_Personajes;
import Modelo.PersonajeFisico;
import Modelo.Interfaces.Defender;

public class Guerrero extends PersonajeFisico implements Defender {
    
    public Guerrero(String Nombre, double Salud, double Nivel, int fuerza, int armadura) {
        super(Nombre, Salud, Nivel, fuerza, armadura);
    }

    @Override
    public void atacar() {
        System.out.println(getNombre() + " realiza un ataque físico potente con su espada.");
    }

    @Override
    public void Defender() {
        System.out.println(getNombre() + " se protege con su armadura de nivel " + getArmadura());
    }
}
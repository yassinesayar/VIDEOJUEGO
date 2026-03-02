package Modelo;

public abstract class PersonajeFisico extends Personaje {

     private int Armadura;
    private int Fuerza;

    //constructor , heredamos los atributos de la clase padre Personaje y usamos super
    public PersonajeFisico(String Nombre, double Salud, double Nivel, int fuerza , int armadura) {
        super(Nombre, Salud, Nivel);
        this.Armadura=Armadura;
        this.Fuerza=Fuerza;
    }
}
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

    //creamos un metodo de golpe basico
    public void golpeBasico(Personaje objetivo){
    objetivo.setSalud(objetivo.getSalud() - Fuerza);
    System.out.println(getNombre() + " da un golpe básico a " + objetivo.getNombre() + " causando " + Fuerza + " de daño!");
}

//Getters
public int getArmadura(){
    return Armadura;
}
public int getFuerza(){
    return Fuerza;
}

//setter
public void setArmadura(int Armadura){
    this.Armadura = Armadura;
}
public void setFuerza(int Fuerza){
    this.Fuerza = Fuerza;
}

}
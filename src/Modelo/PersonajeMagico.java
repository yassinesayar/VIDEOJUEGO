package Modelo;

public abstract class PersonajeMagico extends Personaje{
 private double Mana;
 private String Hechizo;
 

 //constructor 
public PersonajeMagico(String Nombre, double Salud, double Nivel, double Mana , String Hechizo) {
        super(Nombre, Salud, Nivel);
        this.Hechizo=Hechizo;
        this.Mana=Mana;
    }
 
    //creamos un metedo para lanzar hechizo
public void lanzarHechizo(Personaje objetivo){
    objetivo.setSalud(objetivo.getSalud() - Mana);
    System.out.println(getNombre()+ "  lanza un hechizo "+ objetivo.getNombre()+" causado "+ Mana + " de daño");
}
public abstract void atacar();

//geters
public double  getMana(){
    return Mana;
}
public String getHechizo(){
    return Hechizo;
}

//setters
public void setMana(double Mana){
    this.Mana=Mana;
}
public void setHechizo(String Hechizo){
    this.Hechizo=Hechizo;
}


}
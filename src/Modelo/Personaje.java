package Modelo;

import java.util.UUID;

//Creamos la clase abstracta porque esta clase va a ser general para que los personajes concretos hereden
//Porque nadie puede usar personaje , tiene que ser un tipo de personaje
public abstract class Personaje{
 private String Nombre;
 private String idPersonaje;
 private double Salud;
 private double Nivel;
  private double Experiencia;
//constructor
//No añadimos el id entre parentesis porque haremos que se genere solo y no reciba nada
public Personaje(String Nombre, double Salud , double Nivel){
    this.Nombre=Nombre;
    this.Salud=Salud;
    this.Nivel=Nivel;
    this.Experiencia=Experiencia;
    //Usamos UUID para generar id automaticos y nunca repetidos con string, porque con double nos costaria
    //llevar mas la cuenta manualmente
    this.idPersonaje=UUID.randomUUID().toString();
}

//creamos el metodo para atacar y abstracto otra vez porque es un metodo sin cuerpo y general
//no creamos mas acciones porque atacar es el la unica accion que tienen en comun todos los personajes
public abstract void atacar();

//getters
public String getNombre(){
return Nombre;
}
public double getSalud(){
    return Salud;
}
public double getNivel(){
    return Nivel;
}
public double getExperiencia(){
    return Experiencia;
}

//setters
public void setSalud(double Salud){
    this.Salud=Salud;
}

public void setNivel(double Nivel){
    this.Nivel=Nivel;
}
public void setNombre(String Nombre){
    this.Nombre=Nombre;
}
public void setExperiencia(){
    this.Experiencia=Experiencia;
}

//metodo para relacionar la experiencia con los niveles , esto lo implementamos en ataques etc
public void subirExperiencia(int cantidad){
    this.Experiencia += cantidad;
    if(this.Experiencia >= 100){
        this.Nivel++;
        this.Experiencia = 0;
    }
}
//vamos a crear un metodo toString para que la info de un personaje se vea organizada
//como la ficha de un personaje
@Override
public String toString(){
    return "Personaje: " + Nombre + " | Id:  "+ idPersonaje+"| Nivel: " +Nivel+ " | Salud: " +Salud;
}

// vamos a asegurarnos de que el id este bajo control y los siguientes metodos fueron generedos por VS 
//Le di a source action y a Generate hashcode and equals y seleccionamos el idPersonaje 

//Generra un codigo numerico basado en el ID
//se usa cuando el personaje se se guargaen colleciones 
@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((idPersonaje == null) ? 0 : idPersonaje.hashCode());
    return result;
}

//Comparamos dos personajes por su id 
//si tienen el mismo id son el mismo personaje
@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Personaje other = (Personaje) obj;
    if (idPersonaje == null) {
        if (other.idPersonaje != null)
            return false;
    } else if (!idPersonaje.equals(other.idPersonaje))
        return false;
    return true;
}


}
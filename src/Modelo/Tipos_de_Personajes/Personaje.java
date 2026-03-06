package Modelo;

import java.util.UUID;

public abstract class Personaje {
    private String Nombre;
    private String idPersonaje;
    private double Salud;
    private double Nivel;
    private double Experiencia;

    public Personaje(String Nombre, double Salud, double Nivel) {
        this.Nombre = Nombre;
        this.Salud = Salud;
        this.Nivel = Nivel;
        this.Experiencia = 0; // FIX: inicializar a 0 explicitamente
        this.idPersonaje = UUID.randomUUID().toString();
    }

    public abstract void atacar();

    public String getNombre() { return Nombre; }
    public double getSalud()  { return Salud; }
    public double getNivel()  { return Nivel; }
    public double getExperiencia() { return Experiencia; }

    public void setSalud(double Salud)   { this.Salud = Salud; }
    public void setNivel(double Nivel)   { this.Nivel = Nivel; }
    public void setNombre(String Nombre) { this.Nombre = Nombre; }

    // FIX: setter con parametro para que realmente asigne el valor
    public void setExperiencia(double experiencia) {
        this.Experiencia = experiencia;
    }

    public void subirExperiencia(int cantidad) {
        this.Experiencia += cantidad;
        if (this.Experiencia >= 100) {
            this.Nivel++;
            this.Experiencia = 0;
        }
    }

    @Override
    public String toString() {
        return "Personaje: " + Nombre + " | Id: " + idPersonaje + " | Nivel: " + Nivel + " | Salud: " + Salud;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idPersonaje == null) ? 0 : idPersonaje.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Personaje other = (Personaje) obj;
        if (idPersonaje == null) {
            if (other.idPersonaje != null) return false;
        } else if (!idPersonaje.equals(other.idPersonaje)) return false;
        return true;
    }
}

package ComunidadEscolar;

import jdk.nashorn.internal.ir.SplitReturn;

import java.util.Random;

public class Alumno {
    protected String nombre;
    protected String sexo;
    protected Integer edad;
    protected Integer calificacion;
    protected String asiste;

    public Alumno(final String nombre, final String sexo, final Integer edad, Integer calificacion) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.calificacion = calificacion;
        setAsiste();
    }
    public Alumno(final String nombre, final String sexo, final Integer edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
    }

    protected boolean asiste(){
        Random random = new Random();
        if (random.nextInt(100) < 30) return false;
        return true;
    }

    @Override
    public String toString(){
        return getClass().getName() + " Nombre: " + nombre + ", Edad: " + edad + ", Sexo: " + sexo +
                ", Calificacion: " + calificacion;
    }

    public String getNombre() { return nombre;}

    public String getSexo() { return sexo;}

    public Integer getEdad() { return edad;}

    public Integer getCalificacion() { return calificacion;}

    public void setAsiste(){
        if(asiste()) asiste = "Presente";
        else asiste = "No está presente";
    }

    public String getAsiste(){ return asiste;}
}

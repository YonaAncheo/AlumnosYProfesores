package ComunidadEscolar;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Sala {
    Profesor profesor;
    List<Alumno> sala;

    public Sala(){
        profesor = new Profesor("Yona", "M", 31, "Programacion");
        sala = new LinkedList<>();
        llenarSala();
        mostrarAsistencia();
        if(sePuedeDarClase()) System.out.println("Se puede dar la clase");
        else System.out.println("No se puede dar la clase");
    }

    public void llenarSala(){
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            Alumno alumno = new Alumno("Alumno"+(i+1),"M",15,random.nextInt(11));
            sala.add(alumno);
        }
    }

    public void mostrarAsistencia(){
        System.out.println(profesor.toString() + " " + profesor.getAsiste());
        for (Alumno alumno: sala) System.out.println(alumno.toString() + " " + alumno.getAsiste());
    }

    public Boolean sePuedeDarClase(){
        Integer asistencia = 0;
        if(profesor.getAsiste() != "Presente") return false;
        for (Alumno alumno : sala) if (alumno.getAsiste() == "Presente") asistencia++;
        System.out.println("Asistieron " + asistencia + " alumnos");
        if (asistencia < 4) return false;
        return true;
    }
}

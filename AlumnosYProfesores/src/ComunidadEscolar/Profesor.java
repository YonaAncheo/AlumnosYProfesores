package ComunidadEscolar;

import java.util.Random;

public class Profesor extends Alumno{
    private String materia;

    public Profesor(final String nombre, final String sexo, final Integer edad, final String materia) {
        super(nombre, sexo, edad);
        this.materia = materia;
        setAsiste();
    }

    @Override
    protected boolean asiste() {
        Random random = new Random();
        if (random.nextInt(100) < 20) return false;
        return true;
    }

    @Override
    public String toString() {
        return getClass().getName() + " Nombre: " + super.nombre + ", Edad: " + super.edad + ", Sexo: " +
                super.sexo + ", Materia: " + materia;
    }

    public String getMateria() {
        return materia;
    }
}

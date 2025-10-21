import java.util.ArrayList;
import java.util.List;

public class Estudiante
    extends Persona
    implements MiembroUniversidad
{
    private String carrera;
    private double promedio;
    private List<Materia> materias;

    public Estudiante(String nombre, String apellido, int edad, String documento, String carrera, double promedio)
    {
        super(nombre, apellido, edad, documento);
        this.carrera = carrera;
        this.promedio = promedio;
        this.materias = new ArrayList<>();
    }

    public String getCarrera() 
    { 
        return this.carrera; 
    }
    public void setCarrera(String carrera) 
    { 
        this.carrera = carrera; 
    }

    public double getPromedio() 
    { 
        return this.promedio; 
    }
    public void setPromedio(double promedio) 
    { 
        this.promedio = promedio; 
    }

    public List<Materia> getMaterias()
    { 
        return this.materias; 
    }

    public void agregarMateria(Materia materia)
    {
        this.materias.add(materia);
    }

    @Override
    public String obtenerRol()
    {
        return "Estudiante";
    }

    @Override
    public String obtenerInformacionCompleta()
    {
        return "Estudiante: " + super.toString() + " | Carrera: " + carrera + " | Promedio: " + promedio;
    }

    @Override
    public String toString()
    {
        return obtenerInformacionCompleta();
    }
}

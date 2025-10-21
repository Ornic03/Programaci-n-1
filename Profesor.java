import java.util.ArrayList;
import java.util.List;

public class Profesor
    extends Persona
    implements MiembroUniversidad
{
    private String especialidad;
    private int añosExperiencia;
    private List<Materia> materiasAsignadas;

    public Profesor(String nombre, String apellido, int edad, String documento, String especialidad, int añosExperiencia)
    {
        super(nombre, apellido, edad, documento);
        this.especialidad = especialidad;
        this.añosExperiencia = añosExperiencia;
        this.materiasAsignadas = new ArrayList<>();
    }

    public String getEspecialidad()
    {
        return especialidad;
    }

    public void setEspecialidad(String especialidad)
    {
        this.especialidad = especialidad;
    }

    public int getAñosExperiencia()
    {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia)
    {
        this.añosExperiencia = añosExperiencia;
    }

    public void asignarMateria(Materia materia)
    {
        this.materiasAsignadas.add(materia);
    }

    @Override
    public String obtenerRol()
    {
        return "Profesor";
    }

    @Override
    public String obtenerInformacionCompleta()
    {
        return "Profesor: " + super.toString() + 
               " | Especialidad: " + especialidad + 
               " | Experiencia: " + añosExperiencia + " años";
    }

    @Override
    public String toString()
    {
        return obtenerInformacionCompleta();
    }
}
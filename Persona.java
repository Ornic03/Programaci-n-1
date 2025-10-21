//import java.util.ArrayList; //PREGUNTAR SANT
//import java.util.List;

public class Persona
{//ATRIBUTOS
    private String nombre;
    private String apellido;
    private int edad;
    private String documento;

    // CONSTRUCTOR CON LOS PARAMETROS
    public Persona(String nombre, String apellido, int edad, String documento)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public void setNombre(String nombreNuevo)
    {
        this.nombre = nombreNuevo; 
    }

    public String getApellido()
    {
        return this.apellido;
    }

    public void setApellido(String apellidoNuevo)
    {
        this.apellido = apellidoNuevo; 
    }

    public int getEdad()
    {
        return this.edad;
    }
    
    public void setEdad(int edadNueva)
    {
        this.edad = edadNueva; 
    }

    public String getDocumento()
    {
        return this.documento;
    }
    
    public void setDocumento(String documentoNuevo)
    {
        this.documento = documentoNuevo; 
    }

    @Override
    public String toString()
    {
        return nombre + " " + apellido + " (DNI: " + documento + ", Edad: " + edad + ")";
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Persona persona = (Persona) obj;
        return documento.equals(persona.documento);
    }

    @Override
    public int hashCode()
    {
        return documento.hashCode();
    }
}

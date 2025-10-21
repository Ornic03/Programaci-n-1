public class Personal
    extends Persona
    implements MiembroUniversidad 
{
    private String departamento;
    private String puesto;
    private String fechaIngreso;

    public Personal(String nombre, String apellido, int edad, String documento, String departamento, String puesto, String fechaIngreso) 
    {
        super(nombre, apellido, edad, documento);
        this.departamento = departamento;
        this.puesto = puesto;
        this.fechaIngreso = fechaIngreso;
    }

    public String getDepartamento() 
    { 
        return departamento; 
    }
    
    public void setDepartamento(String departamento) 
    { 
        this.departamento = departamento; 
    }

    public String getPuesto() 
    { 
        return puesto; 
    }

    public void setPuesto(String puesto) 
    { 
        this.puesto = puesto; 
    }

    public String getFechaIngreso() 
    { 
        return fechaIngreso; 
    }

    public void setFechaIngreso(String fechaIngreso)
    {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String obtenerRol() 
    {
        return "Personal Administrativo";
    }

    @Override
    public String obtenerInformacionCompleta() 
    {
        return "Personal: " + super.toString() + " | Departamento: " + departamento + " | Puesto: " + puesto + " | Ingreso: " + fechaIngreso;
    }

    @Override
    public String toString() 
    {
        return obtenerInformacionCompleta();
    }
}

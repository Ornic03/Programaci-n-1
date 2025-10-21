import java.util.ArrayList;
import java.util.List;

public class Universidad
{
    private String nombre;
    private List<MiembroUniversidad> miembros;

    public Universidad(String nombre)
    {
        this.nombre = nombre;
        this.miembros = new ArrayList<>();
    }

    public void agregarMiembro(MiembroUniversidad miembro)
    {
        this.miembros.add(miembro);
    }

    public void listarMiembros()
    {
        System.out.println("Miembros de la universidad " + nombre + ":");
        for (MiembroUniversidad m : miembros)
        {
            System.out.println(m.obtenerInformacionCompleta());
        }
    }

    public void listarPorRol(String rol)
    {
        System.out.println("Listando " + rol + "s:");
        for (MiembroUniversidad m : miembros)
        {
            if (m.obtenerRol().equalsIgnoreCase(rol))
            {
                System.out.println(m.obtenerInformacionCompleta());
            }
        }
    }
}
public class Main 
{
    public static void main(String[] args) 
    {
        Universidad uni = new Universidad("Universidad Nacional");
        
        Profesor prof1 = new Profesor("Laura", "Gómez", 45, "12345678", "Álgebra", 20);
        Profesor prof2 = new Profesor("Juan", "Pérez", 40, "12345678", "Matemáticas", 15);
        Profesor prof3 = new Profesor("Carlos", "Caballos", 38, "12345678", "Programación", 10);
        
        Materia algebra = new Materia("Álgebra", prof1);
        Materia matematicas = new Materia("Matemáticas", prof2);
        Materia programacion = new Materia("Programación", prof3);

        Estudiante est1 = new Estudiante("Ana", "Pérez", 20, "44555666", "Ingeniería", 8.5);
        est1.agregarMateria(algebra);
        est1.agregarMateria(matematicas);
        est1.agregarMateria(programacion);

        Personal pers1 = new Personal("Carlos", "Ruiz", 38, "40123456", "Mantenimiento", "Supervisor", "12/03/2015");
        uni.agregarMiembro(pers1);
        uni.agregarMiembro(est1);
        uni.agregarMiembro(prof1);
        uni.agregarMiembro(prof2);
        uni.agregarMiembro(prof3);
        System.out.println("\n=== Solo Profesores ===");
        uni.listarPorRol("Profesor");
    }
}

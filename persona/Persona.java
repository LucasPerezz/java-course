package persona;

public class Persona {
    private String nombre;
    private String apellido;
    static int contador = 0;
    private int idPersona = 0;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.idPersona = ++Persona.contador;
    }

    public static int getContadorPersonas() {
        return Persona.contador;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public void setApellido(String nuevoApellido) {
        this.apellido = nuevoApellido;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + ", Apellido " + this.apellido + "ID: " + this.idPersona;
    }
}

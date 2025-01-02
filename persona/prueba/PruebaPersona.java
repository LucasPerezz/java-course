package persona.prueba;

import persona.Persona;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Lucas", "Perez");
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Apellido: " + persona1.getApellido());
        persona1.setNombre("Tomas");
        persona1.setApellido("Perezz");
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Apellido: " + persona1.getApellido());

        System.out.println("*** Creacion de objetos de la clase persona ***");
        var objeto1 = new Persona("Lucas", "Perez");
        System.out.println(objeto1.toString());
        System.out.println(Persona.getContadorPersonas());
    }
}

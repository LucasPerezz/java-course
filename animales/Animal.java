package animales;

public class Animal {

    public void comer() {
        System.out.println("Como muchas veces al dia");
    }

    public void dormir() {
        System.out.println("Duermo muchas horas");
    }

    public void hacerSonido() {
        System.out.println("Haciendo ruido");
    }
}

class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("WOW WOW");
    }

    @Override
    public void dormir() {
        System.out.println("Duerme 15 horas");
        super.dormir(); // Metodo clase padre
    }
}

class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("MIAU");
    }
}

class PruebaAnimal {
    public static void main(String[] args) {
        System.out.println("*** EJEMPLO HERENCIA ***");
        System.out.println("*** CLASE PADRE ***");
        Animal animal1 = new Animal();
        animal1.comer();
        animal1.dormir();

        System.out.println("*** CLASE HIJA ***");
        Perro perro1 = new Perro();
        perro1.hacerSonido();
        perro1.comer();
        perro1.dormir();

        // POLIMORFISMO: UNA CLASE PADRE PUEDE REALIZAR EL COMPORTAMIENTO DE UNA CLASE
        // HIJA
        Animal animal = new Perro();
        animal.hacerSonido();

    }
}
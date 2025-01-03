package introduccion.src.temasAvanzados.src;

public interface Traductor {
    public void traducir();

    default void iniciarTraductor() {
        System.out.println("Iniciando traductor");
    }
}

class Ingles implements Traductor {

    @Override
    public void traducir() {
        System.out.println("Traducido en ingles");
    }
}

class PruebaTraductor {
    public static void main(String[] args) {
        Traductor ingles = new Ingles();
        ingles.iniciarTraductor();
        ingles.traducir();
    }
}

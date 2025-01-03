package introduccion.src.temasAvanzados.src;

public class ClaseAbstracta {
    public static void main(String[] args) {
        FiguraGeometrica figura = new Rectangulo();
        figura.dibujar();

        FiguraGeometrica figura1 = new Circulo();
        figura1.dibujar();
    }
}

abstract class FiguraGeometrica {
    public abstract void dibujar();
}

class Rectangulo extends FiguraGeometrica {
    @Override
    public void dibujar() {
        System.out.println("Se dibuja un rectangulo");
    }
}

class Circulo extends FiguraGeometrica {
    @Override
    public void dibujar() {
        System.out.println("Se dibuja un circulo");
    }
}

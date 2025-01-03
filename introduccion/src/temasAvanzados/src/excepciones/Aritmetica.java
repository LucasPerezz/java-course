package introduccion.src.temasAvanzados.src.excepciones;

public class Aritmetica {
    public static int division(int numerador, int denominador) {
        if (denominador == 0) {
            throw new RuntimeException("Division entre cero");
        }
        return numerador / denominador;
    }
}

class PruebaAritmetica {
    public static void main(String[] args) {
        try {
            var resultado = Aritmetica.division(10, 0);
            System.out.println(resultado);
        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e);
        } finally {
            System.out.println("Se reviso la division entre 0");
        }

    }
}

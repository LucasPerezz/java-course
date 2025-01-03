package introduccion.src.aritmetica.prueba;

import introduccion.src.aritmetica.*;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica operacion1 = new Aritmetica(2, 3);
        operacion1.sumar();
        operacion1.restar();
        operacion1.multiplicar();
        operacion1.dividir();

        System.out.println();
        operacion1.setOperando1(9);
        System.out.println(operacion1.getOperando2());
        operacion1.sumar();
    }
}

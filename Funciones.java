import java.util.Random;

public class Funciones {
    static void saludar(String mensaje) {
        System.out.println(mensaje);
    }

    static int suma(int num1, int num2) {
        return num1 + num2;
    }

    static boolean esPar(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        saludar("hola mundo");
        System.out.println(suma(2, 2));
        if(esPar(2)) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }

        //LARGO DE CADENA
        String text = "cadena";
        System.out.println(text.length());

        String subText1 = text.substring(0, 4);
        System.out.println(subText1);
        String subText2 = text.substring(4);
        System.out.println(subText2);

        int valorAleatorio = new Random().nextInt(100 + 1);
        System.out.println(valorAleatorio);

        var numero = 8.5;
        System.out.println(Math.round(numero));
    }

}

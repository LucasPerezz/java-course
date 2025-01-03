package introduccion.src.temasAvanzados.src;

public class ArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(1, 2, 3, 4);
        variosParametros("Texto", 1, 2, 3, 4, 5);
    }

    static void imprimirNumeros(int... numeros) {
        for (int i : numeros) {
            System.out.println(i);
        }
    }

    static void variosParametros(String nombre, int... numeros) {
        System.out.println(nombre);
        for (int i : numeros) {
            System.out.println(i);
        }
    }
}

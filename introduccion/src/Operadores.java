package introduccion.src;

import java.util.Scanner;

public class Operadores {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // Operadores aritmeticos
        // int a = 3, b = -2, resultado = 0;

        // //suma
        // resultado = a + b;
        // System.out.println("Suma = " + resultado);

        // //resta
        // resultado = a - b;
        // System.out.println("Resta = " + resultado);

        // //multiplicacion
        // resultado = a * b;
        // System.out.println("Multiplicacion = " + resultado);

        // //Division
        // resultado = a / b;
        // System.out.println("Division = " + resultado);

        // // Modulo
        // resultado = a % b;
        // System.out.println("Modulo = " + resultado);

        // Operador unario -
        // resultado = -a;
        // System.out.println(resultado);
        // resultado = -b;
        // System.out.println(resultado);

        // EJERCICIO: Realizar un programa para saber si el valor proporcionado se
        // encuentra dentro de un rango definido
        // final int VALOR_INICIAL = 0;
        // final int VALOR_FINAL = 5;
        // Scanner consola = new Scanner(System.in);
        // System.out.println("Ingrese un numero");
        // int num = Integer.parseInt(consola.nextLine());
        // if(num >= VALOR_INICIAL && num <= VALOR_FINAL) {
        // System.out.println("El numero esta dentro del rango ");
        // } else {
        // System.out.println("El numero no esta dentro del rango");
        // }

        // Ejercicio: Calcular el area de un rectangulo
        // Scanner consola = new Scanner(System.in);
        // System.out.println("Calcular area de un rectangulo");
        // System.out.println("Ingrese la altura del rectangulo");
        // double altura = Float.parseFloat(consola.nextLine());
        // System.out.println("Ingrese el lado del rectangulo");
        // double lado = Float.parseFloat(consola.nextLine());
        // double area = altura * lado;
        // System.out.println("Area del rectangulo: " + area);

        // Switch
        System.out.println("Ingrese el dia de la semana");
        var diaSemana = Integer.parseInt(new Scanner(System.in).nextLine());
        switch (diaSemana) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Dia de la semana erroneo");
        }
    }
}

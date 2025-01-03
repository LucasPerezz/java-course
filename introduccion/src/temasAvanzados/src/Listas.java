package introduccion.src.temasAvanzados.src;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");

        for (String diaSemana : miLista) {
            System.out.println(diaSemana);
        }

        // Funciones lamda (funcion anonima de un codigo muy compacto)
        miLista.forEach(elemento -> {
            System.out.println(elemento);
        });

        miLista.forEach(System.out::println);
    }
}

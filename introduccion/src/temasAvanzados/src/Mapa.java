package introduccion.src.temasAvanzados.src;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<String, String> persona = new HashMap<>();
        persona.put("nombre", "Diego");
        persona.put("apellido", "Flores");
        persona.put("edad", "31");

        persona.entrySet().forEach(System.out::println);
        persona.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });
    }
}

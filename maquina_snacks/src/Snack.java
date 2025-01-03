package maquina_snacks.src;

import java.io.Serializable;
import java.util.Objects;

public class Snack implements Serializable {
    private static int contadorSnacks;
    private int idSnack;
    private String nombre;
    private double precio;

    public Snack() {
        this.idSnack = ++Snack.contadorSnacks;
    }

    public Snack(String nombre, double precio) {
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdSnack() {
        return this.idSnack;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static int getContadorSnacks() {
        return contadorSnacks;
    }

    @Override
    public String toString() {
        return "Snack {" + "idSnack=" + this.idSnack + ", nombre='" + this.nombre + '\'' + ", precio=" + this.precio
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Snack snack = (Snack) o;
        return idSnack == snack.idSnack &&
                Double.compare(snack.precio, precio) == 0 &&
                nombre.equals(snack.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.idSnack, this.nombre, this.precio);
    }

}

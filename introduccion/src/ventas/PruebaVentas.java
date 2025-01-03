package introduccion.src.ventas;

public class PruebaVentas {
    public static void main(String[] args) {
        System.out.println("*** SISTEMA DE VENTAS ***");
        Producto camisa = new Producto("Camisa", 50.00);
        Producto pantalon = new Producto("Pantalon", 100.00);

        Orden orden = new Orden();
        orden.agregarProducto(camisa);
        orden.agregarProducto(pantalon);
        orden.mostrarOrden();

        Orden orden1 = new Orden();
        orden1.agregarProducto(pantalon);
        orden1.mostrarOrden();
    }
}

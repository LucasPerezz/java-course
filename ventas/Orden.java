package ventas;

public class Orden {
    private final int idOrden;
    private Producto[] productos;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;
    private static int contadorOrdenes;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto) {
        if (contadorProductos < Orden.MAX_PRODUCTOS) {
            this.productos[this.contadorProductos++] = producto;
        } else {
            System.out.println("No se puede agregar más productos. Máximo permitido: " + MAX_PRODUCTOS);
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (var producto : this.productos) {
            if (producto != null) {
                total += producto.getPrecio();
            }
        }
        return total;
    }

    public void mostrarOrden() {
        System.out.println("ID ORDEN: " + this.idOrden);
        System.out.println("Productos de la orden:");

        for (int i = 0; i < contadorProductos; i++) {
            System.out.println("\t" + this.productos[i]);
        }

        double totalOrden = this.calcularTotal();
        System.out.println("Total de la orden: $" + totalOrden);
    }
}

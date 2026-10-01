public class Empleado extends Persona {

    private int ventas;
    private Venta venta;

    public Empleado(String nombre, int dni, String telefono, int ventas, Venta venta) {
        super(nombre, dni, telefono);
        this.ventas = ventas;
        this.venta = venta;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public void registrarVenta() {
        this.ventas += 1;
    }
}

public class Empleado extends Persona {

    private int ventas;
    private Venta venta;

    public Empleado(String nombre, int dni, String telefono, int ventas) {
        super(nombre, dni, telefono);
        this.ventas = ventas;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public void registrar() {
        this.ventas += 1;
    }
}

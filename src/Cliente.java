public class Cliente extends Persona {

    private int compras;
    private Venta venta;

    public Cliente(String nombre, int dni, String telefono, int compras) {
        super(nombre, dni, telefono);
        this.compras = compras;
    }

    public int getCompras() {
        return compras;
    }

    public void setCompras(int compras) {
        this.compras = compras;
    }

    public void registrarCompra(String fecha, Neumatico[] neumaticos) {
        this.venta = new Venta(fecha, neumaticos);
        this.compras += 1;
    }
}

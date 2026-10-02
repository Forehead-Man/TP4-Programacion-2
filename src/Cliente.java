public class Cliente extends Persona {

    private int compras;
    private Venta venta;

    public Cliente(String nombre, int dni, String telefono) {
        super(nombre, dni, telefono);
        this.compras = 0;
    }

    public int getCompras() {
        return compras;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setCompras(int compras) {
        this.compras = compras;
    }

    @Override
    public void registrar(String fecha, Neumatico neumatico,int cantidadVendida) {
        this.venta = new Venta(fecha, neumatico, cantidadVendida);
        this.compras += 1;

        neumatico.actualizarStock(cantidadVendida);
    }
}

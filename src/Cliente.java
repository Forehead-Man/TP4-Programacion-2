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
        try {
            if (fecha == null || fecha.isEmpty()) {
                throw new IllegalArgumentException("Fecha no puede ser nula o vacía");
            }
            if (neumatico == null) {
                throw new IllegalArgumentException("Neumatico no puede ser nulo");
            }
            if (cantidadVendida <= 0) {
                throw new IllegalArgumentException("Cantidad vendida debe ser mayor a 0");
            }
            this.venta = new Venta(fecha, neumatico, cantidadVendida);
            this.compras += 1;
            neumatico.actualizarStock(cantidadVendida);
        } catch (IllegalArgumentException e) {
            System.err.println("Error al registrar compra: " + e.getMessage());
        }
    }
}

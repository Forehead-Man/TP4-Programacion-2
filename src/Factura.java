public class Factura {
    private Venta venta;
    private int numeroFactura;

    public Factura(Venta venta, int numeroFactura){
        this.venta = venta;
        this.numeroFactura = numeroFactura;
    }

    public void imprimirFactura(){
        System.out.println("Imprimiendo factura...");
    }

    public float calcularTotal(){
        try {
            if (this.venta == null) {
                throw new IllegalStateException("Venta no asignada");
            }
            Neumatico neumatico = this.venta.getNeumatico();
            if (neumatico == null) {
                throw new IllegalStateException("Neumatico no asignado a la venta");
            }
            return neumatico.getValorUnitario() * this.venta.getCantidadVendida();
        } catch (IllegalStateException e) {
            System.err.println("Error al calcular total: " + e.getMessage());
            return 0;
        }
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }
}

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
        Neumatico neumatico = this.venta.getNeumatico();
        return neumatico.getValorUnitario() * this.venta.getCantidadVendida();
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

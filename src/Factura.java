public class Factura {
    private int cantidadCompra;
    private Venta venta;

    public Factura(Venta venta, int cantidadCompra){
        this.venta = venta;
        this.cantidadCompra = cantidadCompra;
    }

    public void imprimirFactura(){
        System.out.println("Imprimiendo factura...");
    }

    public float calcularTotal(float iva){
        Neumatico neumatico = this.venta.getNeumatico();
        return neumatico.getValorUnitario() * (1 + iva) * this.cantidadCompra;
    }
}

public class Venta {
    private String fecha;
    private Neumatico neumatico;
    private int cantidadVendida;

    public Venta(String fecha, Neumatico neumatico,int cantidadVendida){
        this.fecha = fecha;
        this.neumatico = neumatico;
        this.cantidadVendida = cantidadVendida;
    }

    public Factura crearFactura(int numeroFactura){
    Factura facturaNueva = new Factura(this,numeroFactura);
    return facturaNueva;
    }

    public String getFecha() {
        return fecha;
    }

    public Neumatico getNeumatico() {
        return neumatico;
    }

    public int getCantidadVendida() {return cantidadVendida;}

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}

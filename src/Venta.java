public class Venta {
    private String fecha;
    private Factura factura;
    private Neumatico[] neumaticos;

    public Venta(String fecha, Factura factura, Neumatico[] neumaticos) {
        this.fecha = fecha;
        this.factura = factura;
        this.neumaticos = neumaticos;
    }

    public Venta(String fecha, Neumatico[] neumaticos){
        this.fecha = fecha;
        this.neumaticos = neumaticos;
    }

    public void registrarVenta(){

    }

}

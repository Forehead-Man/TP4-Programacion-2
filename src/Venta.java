public class Venta {
    private String fecha;
    private Neumatico neumatico;

    public Venta(String fecha, Neumatico neumatico){
        this.fecha = fecha;
        this.neumatico = neumatico;
    }

    public void registrarVenta(){

    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Neumatico getNeumatico() {
        return neumatico;
    }

}

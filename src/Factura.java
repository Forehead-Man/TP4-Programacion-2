public class Factura {
    private float precioBase;

    public Factura(){}

    public void imprimirFactura(){

    }

    public void setPrecioBase(float precioBase){
        this.precioBase = precioBase;
    }

    public float calcularTotal(float iva){
        return this.precioBase * (1 + iva);
    }
}

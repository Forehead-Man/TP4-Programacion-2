public class Proveedor {
    private String razonSocial;

    public Proveedor(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public void enviarPedido(){
        System.out.println("Enviando pedido...");
    }
}

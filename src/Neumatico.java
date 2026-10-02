public class Neumatico {
    private String marca;
    private int stock;
    private Proveedor proveedor;
    private float valorUnitario;

    public Neumatico(String marca, int stock, Proveedor proveedor, float valorUnitario) {
        this.marca = marca;
        this.stock = stock;
        this.proveedor = proveedor;
        this.valorUnitario = valorUnitario;
    }

    public Neumatico(String marca, int stock, float valorUnitario) {
        this.marca = marca;
        this.stock = stock;
        this.valorUnitario = valorUnitario;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public void actualizarStock(int cantidad) {
        this.stock -= cantidad;
    }

    public void agregarStock(){
        int cantidad = proveedor.enviarPedido();
        this.stock = stock + cantidad;
    }
}

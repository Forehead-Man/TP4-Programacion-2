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
        try {
            if (cantidad < 0) {
                throw new IllegalArgumentException("Cantidad no puede ser negativa");
            }
            if (this.stock < cantidad) {
                throw new IllegalStateException("Stock insuficiente. Stock actual: " + this.stock + ", cantidad requerida: " + cantidad);
            }
            this.stock = stock - cantidad;
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.err.println("Error al actualizar stock: " + e.getMessage());
        }
    }

    public void agregarStock(){
        try {
            if (this.proveedor == null) {
                throw new IllegalStateException("Proveedor no asignado");
            }
            int cantidad = proveedor.enviarPedido();
            if (cantidad < 0) {
                throw new IllegalArgumentException("Cantidad no puede ser negativa");
            }
            this.stock = stock + cantidad;
        } catch (IllegalStateException | IllegalArgumentException e) {
            System.err.println("Error al agregar stock: " + e.getMessage());
        }
    }
}

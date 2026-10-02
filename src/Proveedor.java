import java.util.Scanner;
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

    public int enviarPedido(){
        Scanner read = new Scanner(System.in);
        System.out.println("cuentas unidades hay en el pedido?");
        int cantidad = read.nextInt();
        return cantidad;
    }
}

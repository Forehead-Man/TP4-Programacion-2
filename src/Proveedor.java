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
        try {
            System.out.println("cuentas unidades hay en el pedido?");
            int cantidad = read.nextInt();
            if (cantidad < 0) {
                throw new IllegalArgumentException("Cantidad no puede ser negativa");
            }
            return cantidad;
        } catch (java.util.InputMismatchException e) {
            System.err.println("Error: debe ingresar un número válido");
            read.nextLine();
            return 0;
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
            return 0;
        } finally {
            read.close();
        }
    }
}

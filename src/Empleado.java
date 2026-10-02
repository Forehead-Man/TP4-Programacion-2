public class Empleado extends Persona {

    private int ventas;


    public Empleado(String nombre, int dni, String telefono) {
        super(nombre, dni, telefono);
        this.ventas = 0;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public void registrar() {
        this.ventas += 1;
    }
}

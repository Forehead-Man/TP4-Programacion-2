public class Empleado extends Persona {

    private int ventas;


    public Empleado(String nombre, int dni, String telefono, int ventas) {
        super(nombre, dni, telefono);
        this.ventas = ventas;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    @Override
    public void registrar() {
        this.ventas += 1;
    }
}

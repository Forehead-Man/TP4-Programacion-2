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

    @Override
    public void registrar(String fecha, Neumatico neumatico, int cantidadVendida) {
        try {
            if (fecha == null || fecha.isEmpty()) {
                throw new IllegalArgumentException("Fecha no puede ser nula o vacía");
            }
            if (neumatico == null) {
                throw new IllegalArgumentException("Neumatico no puede ser nulo");
            }
            if (cantidadVendida <= 0) {
                throw new IllegalArgumentException("Cantidad vendida debe ser mayor a 0");
            }
            this.ventas += 1;
            neumatico.actualizarStock(cantidadVendida);
        } catch (IllegalArgumentException e) {
            System.err.println("Error al registrar venta: " + e.getMessage());
        }
    }
}

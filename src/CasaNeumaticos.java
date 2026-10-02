import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class CasaNeumaticos {

    private String direccion;
    private ArrayList<Empleado> listaEmpleados;


    public CasaNeumaticos(String direccion) {
        this.direccion = direccion;
        this.listaEmpleados = new ArrayList<>();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void agregarEmpleado(String nombre, int dni, String telefono){
        try {
            if (nombre == null || nombre.isEmpty()) {
                throw new IllegalArgumentException("Nombre no puede ser nulo o vacío");
            }
            if (telefono == null || telefono.isEmpty()) {
                throw new IllegalArgumentException("Telefono no puede ser nulo o vacío");
            }
            Empleado empleado = new Empleado(nombre, dni, telefono);
            listaEmpleados.add(empleado);
            System.out.println("Agregado con exito");
        } catch (IllegalArgumentException e) {
            System.err.println("Error al agregar empleado: " + e.getMessage());
        }
    }

    public void eliminarEmpleado(){
        Scanner read = new Scanner(System.in);
        try {
            System.out.println("ingrese el DNI del empleado a eliminar");
            int dniR = read.nextInt();
            boolean eliminado = listaEmpleados.removeIf(empleado1 -> empleado1.getDni() == dniR);
            if (eliminado) {
                System.out.println("el empleado se ha eliminado");
            }else{
                System.out.println("ese empleado no existe");
            }
        } catch (java.util.InputMismatchException e) {
            System.err.println("Error: debe ingresar un número de DNI válido");
            read.nextLine();
        } finally {
            read.close();
        }
    }
    public void mostrarEmpleados(){
        Iterator iteratorEmpleados = listaEmpleados.iterator();

        while (iteratorEmpleados.hasNext()){
            Empleado empleadoActual = (Empleado) iteratorEmpleados.next();

            System.out.println("Nombre:" + empleadoActual.getNombre());
            System.out.println("DNI:" + empleadoActual.getDni());
            System.out.println("Telefono:" + empleadoActual.getTelefono());

        }
    }

}

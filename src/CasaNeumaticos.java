import java.util.ArrayList;
import java.util.Scanner;
public class CasaNeumaticos {

    private String direccion;
    private ArrayList<Empleado> listaEmpleados;

    public CasaNeumaticos(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void agregarEmpleado(String nombre, int dni, String telefono, int ventas){
        Empleado empleado = new Empleado(nombre, dni, telefono, ventas);
        listaEmpleados.add(empleado);
    }

    public void eliminarEmpleado(Empleado empleado){
        Scanner read = new Scanner(System.in);
        System.out.println("ingrese el DNI del empleado a eliminar");
        int dniR = read.nextInt();
        boolean eliminado = listaEmpleados.removeIf(empleado1 -> empleado1.getDni() == dniR);
        if (eliminado) {
            System.out.println("el empleado se ha eliminado");
        }else{
            System.out.println("ese empleado no existe");
        }
    }
}

import java.util.Scanner;
void main() {
int seleccionador;
String stringAuxiliar1;
String stringAuxiliar2;
int intAuxiliar1;
int intAuxiliar2;
Scanner read = new Scanner(System.in);

    System.out.println("Ingrese la direccion de la casa de neumaticos");
    stringAuxiliar1 = read.nextLine();
    CasaNeumaticos casaNeumaticosActual = new CasaNeumaticos(stringAuxiliar1);

do{
    System.out.println("ingrese 0 para continuar el programa");
    System.out.println("Ingrese 1 para agregar un empleado");
    System.out.println("Ingrese 2 para eliminar un empleado");
    System.out.println("Ingrese 3 para mostrar los empleados");
    seleccionador = read.nextInt();
    read.nextLine();

    switch (seleccionador){
        case 0:
            System.out.println("Saliendo del progama");
            break;
        case 1:
            System.out.println("Ingrese el nombre del empleado");
            stringAuxiliar1 = read.nextLine();
            System.out.println("ingrese el DNI del empleado");
            intAuxiliar1 = read.nextInt();
            read.nextLine();
            System.out.println("Ingrese el telefono del empleado");
            stringAuxiliar2 = read.nextLine();

            casaNeumaticosActual.agregarEmpleado(stringAuxiliar1,intAuxiliar1,stringAuxiliar2);
            break;
        case 2:
            casaNeumaticosActual.eliminarEmpleado();
            break;
        case 3:
            casaNeumaticosActual.mostrarEmpleados();
            break;
        default:
            System.out.println("El numero ingresado no esta entre las opciones");

    }
} while(seleccionador != 0);


    System.out.println("Ingrese el nombre de su proveedor de neumaticos");
    stringAuxiliar1 = read.nextLine();
    Proveedor proveedor1 = new Proveedor(stringAuxiliar1);

    System.out.println("Ingrese cuantos neumaticos le va a comprar a ese proveedor");
    intAuxiliar1 = read.nextInt();
    read.nextLine();
    System.out.println("Ingrese el valor unitario de esos neumaticos");
    intAuxiliar2 = read.nextInt();
    read.nextLine();

    Neumatico neumatico1 = new Neumatico("clasico",intAuxiliar1,proveedor1,intAuxiliar2);

    System.out.println("Ingrese la informacion de su primer cliente");
    System.out.println("Ingrese el nombre del cliente");
    stringAuxiliar1 = read.nextLine();
    System.out.println("ingrese el DNI del cliente");
    intAuxiliar1 = read.nextInt();
    System.out.println("Ingrese el telefono del cliente");
    stringAuxiliar2 = read.nextLine();

    Cliente clienteActual = new Cliente(stringAuxiliar1,intAuxiliar1,stringAuxiliar2);

    System.out.println("El cliente hizo su primera compra");
    do {
        System.out.println("Ingrese cuantos neumaticos compro,mayor que 0 e igual o menor a " + neumatico1.getStock());
        intAuxiliar1 = read.nextInt();
        read.nextLine();
    } while(intAuxiliar1 < 0 || intAuxiliar1 > neumatico1.getStock());

   clienteActual.registrar("hoy",neumatico1,intAuxiliar1);

    System.out.println("Venta realizada con exito");

    System.out.println("Hagamos una factura que registre la venta, ingrese el numero de factura");
    intAuxiliar1 = read.nextInt();
    read.nextLine();

    Factura factura1 = clienteActual.getVenta().crearFactura(intAuxiliar1);

    System.out.println("El total de la factura es " + factura1.calcularTotal());

    System.out.println("vamos a imprimir la factura");
    factura1.imprimirFactura();

}

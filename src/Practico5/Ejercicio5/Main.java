package Practico5.Ejercicio5;

public class Main {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Jorge", "Perez", 26624516, 35215.2);
        Empleado emp2 = new Empleado("Jorge", "Manso", 15645789, 40156.55);
        Empleado emp3 = new EmpleadoVendedor("Ernesto", "Perez", 26624516, 30215.2,30540,5);
        Empleado emp4 = new EmpleadoVendedor("Claudio", "Coudet", 32156147, 38654,45000,7);
        Empleado emp5 = new EmpleadoVendedor("Diego", "Maradona", 25647951, 50015,145000,10);
        Empleado emp6 = new EmpleadoConBono("Diego", "Caniggia", 27894159, 25000, 45000,5,50, 55,5000);
        Empleado emp7 = new EmpleadoConBono("Oscar", "Ruggeri", 26489785, 25000, 25046,4,78, 55,5000);
        Empleado emp8 = new EmpleadoConBono("Tito", "Perrota", 28645132, 25000, 56200,8,128, 100,15000);
        Empleado emp9 = new EmpleadoConBono("Diego", "Torres", 24654987, 25000, 51056,6,115, 100,15000);

        Empresa empresa1 = new Empresa("Espn marketing");

        empresa1.agregarEmpleado(emp1);
        empresa1.agregarEmpleado(emp2);
        empresa1.agregarEmpleado(emp3);
        empresa1.agregarEmpleado(emp4);
        empresa1.agregarEmpleado(emp5);
        empresa1.agregarEmpleado(emp6);
        empresa1.agregarEmpleado(emp7);
        empresa1.agregarEmpleado(emp8);
        empresa1.agregarEmpleado(emp9);

        System.out.println(empresa1.toString());
        System.out.println("Gastos totales de la empresa: " + empresa1.getGastosSueldos());


    }
}

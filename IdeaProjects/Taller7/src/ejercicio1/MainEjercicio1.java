package ejercicio1;

public class MainEjercicio1 {
    public static void main(String[] args) {
        Empleado emp = new Empleado("Carlos Pérez", 1500000);
        System.out.println("Nombre (Público): " + emp.nombre);
        System.out.println("Salario inicial (Get): " + emp.getSalario());

        emp.setSalario(1800000);
        System.out.println("Nuevo salario (Set): " + emp.getSalario());
    }
}

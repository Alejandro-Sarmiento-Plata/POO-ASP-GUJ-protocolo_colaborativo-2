package ejercicio3;

public class EmpleadoT8 {
    protected String nombre;
    protected double salario;

    public EmpleadoT8(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre + ", Salario: " + salario);
    }
}

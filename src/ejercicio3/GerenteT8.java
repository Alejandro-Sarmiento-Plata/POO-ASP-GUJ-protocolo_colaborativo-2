package ejercicio3;

public class GerenteT8 extends EmpleadoT8 {
    private String departamento;

    public GerenteT8(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Departamento: " + departamento);
    }
}

package ejercicio5;

public class PerroT8 extends Animal {
    private String raza;

    public PerroT8(String especie, String raza) {
        super(especie); // Llamada obligatoria al constructor de la clase base
        this.raza = raza;
    }

    public void mostrarDetallesPerro() {
        mostrarEspecie();
        System.out.println("Raza: " + raza);
    }
}


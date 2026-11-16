package ejercicio4;

public class CocheError extends VehiculoPrivado {
    public CocheError(String marca) {
        super(marca);
    }

    public void mostrarMarca() {
        // System.out.println(marca); -> Error de compilación: 'marca' tiene acceso privado
    }
}

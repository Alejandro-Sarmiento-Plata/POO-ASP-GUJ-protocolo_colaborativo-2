package ejercicio2;

public class MainEjercicio2 {
    public static void main(String[] args) {
        CuentaBancariaT7 cuenta = new CuentaBancariaT7("123456789", 500000, "Ahorros");
        cuenta.mostrarDetalles();

        // Intento de acceso directo a un atributo privado (Genera error de compilación si se descomenta)
        // System.out.println(cuenta.numeroCuenta);
    }
}

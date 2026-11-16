package ejercicio3;

public class UtilidadesT7 {
    public static double sumar(double a, double b) { return a + b; }
    public static double restar(double a, double b) { return a - b; }
    public static double multiplicar(double a, double b) { return a * b; }
    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: División entre cero.");
            return 0;
        }
        return a / b;
    }
}


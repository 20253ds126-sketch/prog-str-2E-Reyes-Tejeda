import java.util.Scanner;

public class Main {

    private static final int TOTAL_NUMEROS = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = leerEntero(scanner, "a");
        int b = leerEntero(scanner, "b");
        int c = leerEntero(scanner, "c");

        int suma = calcularSuma(a, b, c);
        double promedio = calcularPromedio(suma, TOTAL_NUMEROS);

        mostrarResultados(suma, promedio);

        scanner.close();
    }

    private static int leerEntero(Scanner scanner, String nombreVariable) {
        System.out.print(nombreVariable + ": ");
        return scanner.nextInt();
    }

    private static int calcularSuma(int a, int b, int c) {
        return a + b + c;
    }

    private static double calcularPromedio(int suma, int total) {
        return suma / (double) total;
    }

    private static void mostrarResultados(int suma, double promedio) {
        System.out.println("suma = " + suma);
        System.out.println("prom = " + promedio);
    }
}



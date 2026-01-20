import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = pedirEntero(scanner, "a: ");
        int b = pedirEntero(scanner, "b: ");
        int c = pedirEntero(scanner, "c: ");

        int suma = calcularSuma(a, b, c);

        System.out.println("suma=" + suma);
        System.out.println("prom=" + calcularPromedio(suma));

        scanner.close();
    }

    /**
     * Metodo que retorna un entero capturado por consola
     * @param scanner Scanner previamente creado en main
     * @param mensaje Mensaje que se muestra al usuario
     * @return valor entero ingresado
     */
    public static int pedirEntero(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        return scanner.nextInt();
    }

    /**
     * Metodo que calcula la suma de tres numeros
     * @param a primer valor
     * @param b segundo valor
     * @param c tercer valor
     * @return suma de los valores
     */
    public static int calcularSuma(int a, int b, int c) {
        return a + b + c;
    }

    /**
     * Metodo que calcula el promedio de la suma
     * @param suma suma total de los valores
     * @return promedio
     */
    public static double calcularPromedio(int suma) {
        return suma / 3.0;
    }
}

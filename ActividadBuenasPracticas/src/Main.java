import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero = pedirEntero();
        int resultado = sumarHastaN(numero);

        System.out.println("La suma de los números del 1 al " + numero + " es: " + resultado);
    }

    public static int pedirEntero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entero positivo: ");
        int numero = scanner.nextInt();
        scanner.close();
        return numero;
    }

    public static int sumarHastaN(int numero) {
        int suma = 0;
        for (int i = 1; i <= numero; i++) {
            suma += i;
        }
        return suma;
    }
}
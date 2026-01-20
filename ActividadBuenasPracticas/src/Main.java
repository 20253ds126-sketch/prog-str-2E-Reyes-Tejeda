import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = pedirEntero(sc, "Ingresa un número entero");
        int resultado = sumarHastaN(numero);

        System.out.println("Resultado: " + resultado);
    }

    /**
     * Metodo que solicita un numero entero por consola
     * @param sc -> Scanner previamente declarado
     * @param mensaje -> texto mostrado al usuario
     * @return -> numero entero capturado
     */
    public static int pedirEntero(Scanner sc, String mensaje) {
        System.out.println(mensaje);
        return sc.nextInt();
    }

    /**
     * Metodo que calcula la suma de los numeros desde 1 hasta n
     * @param n -> numero limite para la suma
     * @return -> resultado de la suma
     */
    public static int sumarHastaN(int n) {
        int suma = 0;

        for (int i = 1; i <= n; i++) {
            suma += i;
        }

        return suma;
    }
}
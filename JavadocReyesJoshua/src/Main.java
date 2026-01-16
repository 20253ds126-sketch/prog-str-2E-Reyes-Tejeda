import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("MENU");
            System.out.println("1. Calcular IMC");
            System.out.println("2. Calcular area de un rectangulo");
            System.out.println("3. Convertir °C a °F");
            System.out.println("4. Calcular area de un circulo");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opcion: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Peso en kg: ");
                    double peso = scanner.nextDouble();
                    System.out.print("Altura en metros: ");
                    double altura = scanner.nextDouble();
                    double imc = calcularIMC(peso, altura);
                    System.out.println("IMC: " + imc);
                    break;

                case 2:
                    System.out.print("Base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Altura: ");
                    double h = scanner.nextDouble();
                    System.out.println("Area del rectangulo: " + calcularAreaRectangulo(base, h));
                    break;

                case 3:
                    System.out.print("Grados Celsius: ");
                    double celsius = scanner.nextDouble();
                    System.out.println("Fahrenheit: " + convertirCelsiusAFahrenheit(celsius));
                    break;

                case 4:
                    System.out.print("Radio: ");
                    double radio = scanner.nextDouble();
                    System.out.println("Area del circulo: " + calcularAreaCirculo(radio));
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

            System.out.println();

        } while (opcion != 5);

    }

    /**
     * Calcula el Indice de Masa Corporal usando peso y altura.
     * @param pesoKg peso de la persona en kilogramos
     * @param alturaM altura de la persona en metros
     * @return valor del IMC
     */
    public static double calcularIMC(double pesoKg, double alturaM) {

        return pesoKg / (alturaM * alturaM);
    }

    /**
     * Calcula el area de un rectangulo.
     * @param base base del rectangulo
     * @param altura altura del rectangulo
     * @return area calculada
     */
    public static double calcularAreaRectangulo(double base, double altura) {

        return base * altura;
    }

    /**
     * Convierte grados Celsius a Fahrenheit.
     * @param celsius temperatura en grados Celsius
     * @return temperatura en Fahrenheit
     */
    public static double convertirCelsiusAFahrenheit(double celsius) {

        return (celsius * 9 / 5) + 32;
    }

    /**
     * Calcula el area de un circulo a partir del radio.
     * @param radio radio del circulo
     * @return area del circulo
     */
    public static double calcularAreaCirculo(double radio) {

        return Math.PI * radio * radio;
    }
}

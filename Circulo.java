import java.util.Scanner;
/**
 * @author indiloqui 
 * @version 28/09/2026
 */
public class Circulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Pedir el radio por teclado
        System.out.print("Introduce el radio en metros: ");
        double radio = sc.nextDouble();

        // 2. Cálculos geométricos
        double longitud = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio, 2);

        // 3. Mostrar resultados con 4 decimales
        System.out.printf("Longitud de la circunferencia: %.4f m%n", longitud);
        System.out.printf("Área del círculo: %.4f m2%n", area);

        sc.close();
    }
}
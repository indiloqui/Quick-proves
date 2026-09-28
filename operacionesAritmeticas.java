import java.util.Scanner;

/**
 * @author indiloqui 
 * @version 28/09/2026
 */
public class operacionesAritmeticas
{
    public static void main(String[] args) {
        // 1. Creamos el objeto Scanner para leer desde la consola
        Scanner sc = new Scanner(System.in);

        // 2. Pedimos y leemos los dos números enteros
        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();

        // 3. Realizamos los cálculos
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        
        // Convertimos num1 a double para obtener decimales en la división
        double division = (double) num1 / num2; 
        
        int resto = num1 % num2;

        // 4. Mostramos los resultados en pantalla
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División exacta: " + division);
        System.out.println("Resto de la división: " + resto);

        // Cerramos el Scanner
        sc.close();
    }
}
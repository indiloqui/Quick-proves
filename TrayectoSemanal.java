import java.util.Scanner;

/**
 * A quick test from class.
 * @author Indi
 */
public class TrayectoSemanal
{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        //Entrada de los datos
        System.out.println("Introduce tu nombre: ");
        String nombre = teclado.nextLine();
        
        System.out.println("Introduce tu residencia: ");
        String residencia = teclado.nextLine();
        
        System.out.println("Introduce los kilómetros recorridos diarios hasta el instituto: ");
        double kilometros = teclado.nextDouble();
        
        
        //Cálculo
        double distancia = kilometros * 2 * 5;
        
        
        //salida de datos
        System.out.println("\n---------------------------------");
        System.out.printf("Nombre: %s%n", nombre);
        System.out.printf("Población de residencia: %s%n", residencia);
        System.out.printf("Kilómetros diarios: %.2f km%n", kilometros);
        System.out.printf("Trayecto semanal (ida y vuelta): %.2f km%n", distancia);
        System.out.println("-----------------------------------");
        
        teclado.close();
    }
}
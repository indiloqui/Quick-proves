import java.util.Scanner;

/**
 * A quick test from class.
 * @author Indi
 * 21 september
 */
public class ConversionEuros
{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        final double TIPO_CAMBIO = 1.08;
        
        //Entrada de los datos
        System.out.println("Introduce la cantidad de euros: ");
        double euros = teclado.nextDouble();
        
        //Cálculo
        double dolares = euros * TIPO_CAMBIO;
        
        //salida de datos
        System.out.println("\n---------------------------");
        System.out.printf("Euros: %.2f€%n", euros);
        System.out.printf("Dólares: %.2f$%n", dolares);
        System.out.println("---------------------------");
        
        teclado.close();
    }
}
import java.util.Scanner;

/**
 * A quick test from class.
 * @author Indi
 * 21 september
 */
public class conversorDivisaComision
{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        final double TIPO_CAMBIO = 1.08;
        final double COMISION_FIJA = 1.50;
        
        //Entrada de los datos
        System.out.println("Introduce la cantidad de euros: ");
        double euros = teclado.nextDouble();
        
        //Cálculo
        double dolares = euros * TIPO_CAMBIO;
        double totalDolares = dolares - COMISION_FIJA;
        
        //salida de datos
        System.out.println("\n----------------------------------------");
        System.out.println("            RECIBO DE CAMBIO");
        System.out.println("----------------------------------------");
        System.out.printf("Euros introducidos:       %.2f €%n", euros);
        System.out.printf("Tasa de cambio (1 € =):   %.2f $%n", TIPO_CAMBIO);
        System.out.printf("Dólares brutos:           %.2f $%n", dolares);
        System.out.printf("Comisión fija (%.2f $):   %.2f $%n", COMISION_FIJA, COMISION_FIJA);
        System.out.println("----------------------------------------");
        System.out.printf("Total a recibir:          %.2f $%n", totalDolares);
        System.out.println("----------------------------------------");
        
        teclado.close();
    }
}
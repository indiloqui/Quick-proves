import java.util.Scanner;

/**
 * A quick test from class.
 * @author Indi
 * 21 september
 */
public class AlquilerCoche
{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        final double TARIFA_BASE = 45;
        final double COSTE_KILOMETRO = 0.20;
        
        //Entrada de los datos
        System.out.println("Introduce cuántos días has alquilado el coche: ");
        int dias = teclado.nextInt();
        
        System.out.println("Introduce los kilómetros hechos: ");
        double kilometros = teclado.nextDouble();
        
        //Cálculo
        double costeDias = dias * TARIFA_BASE;
        double costeKilometraje = kilometros * COSTE_KILOMETRO;
        double total = costeDias + costeKilometraje;
        
        //salida de datos
        System.out.println("\n-------------------------------------------");
        System.out.println("DESGLOSE DE LIQUIDACIÓN");
        System.out.println("-------------------------------------------");
        System.out.printf("Días contratados:     %d días (a %.2f €/día) = %.2f €%n", 
                          dias, TARIFA_BASE, costeDias);
        System.out.printf("Kilometraje:          %.1f km (a %.2f €/km)   = %.2f €%n", 
                          kilometros, COSTE_KILOMETRO, costeKilometraje);
        System.out.printf("TOTAL LIQUIDACIÓN:    %.2f €%n", total);
        System.out.println("-------------------------------------------");
        
        teclado.close();
    }
}
import java.util.Scanner;

/**
 * A quick test from class.
 * @author Indi
 * 21 september
 */
public class NominaCalculo
{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        final double RETENCION_IRPF = 0.12;
        final double VALOR_HORA = 14.50;
        
        //Entrada de los datos
        System.out.println("Introduce tu nombre: ");
        String nombre = teclado.nextLine();
        
        System.out.println("Introduce las horas trabajadas este mes: ");
        double horasTrabajadas = teclado.nextDouble();
        
        //Cálculo
        double salarioBruto = VALOR_HORA * horasTrabajadas;
        double retencion = salarioBruto * RETENCION_IRPF;
        double salarioNeto = salarioBruto - retencion;
        
        //salida de datos
        System.out.println("\n---------------------------------");
        System.out.printf("Nombre: %s%n", nombre);
        System.out.printf("Salario bruto: %.2f €%n", salarioBruto);
        System.out.printf("Retención IRPF (%.0f%%): %.2f €%n", RETENCION_IRPF * 100, retencion);
        System.out.printf("Salario neto: %.2f €%n", salarioNeto);
        System.out.println("-----------------------------------");
        
        teclado.close();
    }
}
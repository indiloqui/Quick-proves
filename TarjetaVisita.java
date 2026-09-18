import java.util.Scanner;

/**
 * A quick test from class.
 * @author Indi
 */
public class TarjetaVisita
{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        //Entrada de los datos
        System.out.println("Introduce tu nombre: ");
        String nombre = teclado.nextLine();
        
        System.out.println("Introduce tus apellidos: ");
        String apellidos = teclado.nextLine();
        
        System.out.println("Introduce tu ciclo formativo: ");
        String ciclo = teclado.nextLine();
        
        System.out.println("Introduce tu módulo favorito: ");
        String modulo = teclado.nextLine();
        
        System.out.println("Introduce tu nota media esperada: ");
        double notaMedia = teclado.nextDouble();
        
        
        //salida de datos
        System.out.println("+-------------------------------------------------------+");
        System.out.println("| FICHA DEL ESTUDIANTE                                  |");
        System.out.println("+-------------------------------------------------------+");
        System.out.printf("| Nombre:      %-40s |%n", apellidos + ", " + nombre);
        System.out.printf("| Matrícula:   %-40s |%n", ciclo);
        System.out.printf("| Módulo fav.: %-40s |%n", modulo);
        System.out.printf("| Meta media:  %-40.2f |%n", notaMedia);
        System.out.println("+-------------------------------------------------------+");        
        teclado.close();
    }
}
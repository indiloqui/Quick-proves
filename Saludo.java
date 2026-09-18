import java.util.Scanner;

/**
 * A quick test from class.
 * @author Indi
 */
public class Saludo
{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        //Entrada de los datos
        System.out.println("Introduce tu nombre: ");
        String nombre = teclado.nextLine();
        
        System.out.println("Introduce tu año de nacimiento: ");
        int añoNacimiento = teclado.nextInt();
        
        //calculos
        int añoActual = 2026;
        int edad = 2026 - añoNacimiento;
        
        
        //salida de datos
        System.out.println("+-------------------------------------------------------+");
        System.out.println("|                                                       |");
        System.out.printf("| Hola, %s. Este curso cumplirás %d años.            |%n", nombre, edad);
        System.out.printf("|    ...si no los tienes ya ;)                          |%n");
        System.out.println("|                                                       |");
        System.out.println("+-------------------------------------------------------+");
        
        teclado.close();
    }
}
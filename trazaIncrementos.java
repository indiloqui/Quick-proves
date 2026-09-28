
/**
 * @author indiloqui 
 * @version 28/09/2026
 */
public class trazaIncrementos
{
    public static void main(String[] args) {
        // Declaración e inicialización
        int x = 4;
        int y = 7;
        int z = 2;
        System.out.println("Inicio: x = " + x + ", y = " + y + ", z = " + z);

        // Paso 1: Post-incremento y asignación
        x = y++ * z; 
        System.out.printf("Tras paso 1:       x=%d, y=%d, z=%d%n", x, y, z);
        
        // Paso 2: Pre-incremento en asignación compuesta
        y += ++z * 3;
        System.out.printf("Tras paso 2:       x=%d, y=%d, z=%d%n", x, y, z);
        
        // Paso 3: Módulo y decremento
        z = (x % 5) + y--;
        System.out.printf("Tras paso 3:       x=%d, y=%d, z=%d%n", x, y, z);
        }
}
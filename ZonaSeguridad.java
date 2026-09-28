 /**
 * @author indiloqui 
 * @version 28/09/2026
 */
public class ZonaSeguridad {
    public static void main(String[] args){
        int x = 100 ;
        int y = 20 ;
        
        //paso 1 evalucaion de contención rectángulo [0..100] x [0..50]
        boolean dentroArea = (x >= 0 && x <= 100) && (y >= 0 && y <= 50);
        
        // paso 2 toca alguno de los 4 bordes exteriores
        boolean borde = dentroArea && (x == 0 || x == 100 || y == 0 || y == 50);
        
        //paso 3 interior (sin tocar los bordes)
        boolean interiorEstricto = dentroArea && !borde;
        
        System.out.printf("Punto analizado: (%d, %d)%n", x, y);
        System.out.printf("¿Está dentro del área?:            %b%n", dentroArea);
        System.out.printf("¿Se encuentra sobre el perímetro?: %b%n", borde);
        System.out.printf("¿Es interior estricto?:            %b%n", interiorEstricto);
    }
}
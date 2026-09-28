 /**
 * @author indiloqui 
 * @version 28/09/2026
 */
public class DesgloseTiempo {
    public static void main(String[] args) {
        long totalSegundos = 7384L;
        
        // 1 hora = 3600 segundos
        long horas = totalSegundos / 3600;
        long segundosSobrantes = totalSegundos % 3600;
        
        // 1 minuto = 60 segundos
        long minutos = segundosSobrantes / 60;
        long segundosFinales = segundosSobrantes % 60;
        
        System.out.println("=== DESGLOSE DE TIEMPO ===");
        System.out.printf("Total segundos originales: %d s%n", totalSegundos);
        System.out.printf("Resultado desglosado:      %02d h : %02d m : %02d s%n", 
                          horas, minutos, segundosFinales);
    }
}

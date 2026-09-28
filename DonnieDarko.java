/**
 * @author indiloqui 
 * @version 28/09/2026
 */
public class DonnieDarko {
    public static void main(String[] args) {
        // 28 días, 6 horas, 42 minutos y 12 segundos = 2443332 segundos
        long totalSegundos = 2443332L; 
        
        // 1 día = 86400 segundos
        long dias = totalSegundos / 86400;
        long restoDias = totalSegundos % 86400;
        
        // 1 hora = 3600 segundos
        long horas = restoDias / 3600;
        long restoHoras = restoDias % 3600;
        
        // 1 minuto = 60 segundos
        long minutos = restoHoras / 60;
        long segundosFinales = restoHoras % 60;
        
        System.out.println("=== DESGLOSE DE TIEMPO ===");
        System.out.printf("Total segundos originales: %d s%n", totalSegundos);
        System.out.printf("Hasta el fin del mundo:    %02d dias:%02d horas:%02d minutos:%02d segundos%n", 
                          dias, horas, minutos, segundosFinales);
    }
}
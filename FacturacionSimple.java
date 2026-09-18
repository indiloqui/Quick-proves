import java.util.Scanner;

/**
 * A quick test from class.
 * @author Indi
 */
public class FacturacionSimple
{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        //Entrada de los datos
        System.out.print("Introduce el producto: ");
        String producto = teclado.nextLine();
        
        System.out.print("Introduce la cantidad adquirida: ");
        int cantidad = teclado.nextInt();
        
        System.out.print("Introduce el precio unitario en euros: ");
        double precioUnitario = teclado.nextDouble();
        
        //cálculo
        double subTotal = precioUnitario * cantidad;
        double importeIva = subTotal * 0.21;
        double totalFactura = subTotal + importeIva;
        
        
        //salida de datos
         System.out.println("\n-------------------------------------------");
        System.out.println("RESUMEN DE FACTURA");
        System.out.println("-------------------------------------------");
        System.out.printf("Producto adquirido:  %s%n", producto);
        System.out.printf("Cantidad:            %d%n", cantidad);
        System.out.printf("Precio unitario:     %.2f €%n", precioUnitario);
        System.out.printf("Precio sin IVA:      %.2f €%n", subTotal);
        System.out.printf("IVA (21%%):           %.2f €%n", importeIva);
        System.out.printf("TOTAL A PAGAR:       %.2f €%n", totalFactura);
        System.out.println("-------------------------------------------"); 
        
        teclado.close();
    }
}
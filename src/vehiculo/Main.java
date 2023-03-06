package vehiculo;
/**
 * Clase main del programa, que define un objeto Vehículo con unos parámetros y realiza
 * acciones de vender y comprar vehículos
 * 
 * @author Elisa Palma Pacheco
 */
public class Main {
    /**
* Método main.
*
* Este método es el principal de ejecución del programa
*
*/
    
     /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        VehiculoPalmaPachecoElisa2223 miVehiculoPalmaPachecoElisa2223;
        int stockActual;
        
        miVehiculoPalmaPachecoElisa2223 = new VehiculoPalmaPachecoElisa2223("Seat",18000,100);
        operativaVehiculosPalmaPachecoElisa2223(miVehiculoPalmaPachecoElisa2223, 50); 
    }
 /*Vamos a vender vehículos, como hay suficientes vehículos se podrán vender */
    public static void operativaVehiculosPalmaPachecoElisa2223(VehiculoPalmaPachecoElisa2223 miVehiculoPalmaPachecoElisa2223, int cantidad) {
        int stockActual;
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoPalmaPachecoElisa2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
         /*Vamos a comprar más vehículos, ya que con la venta ha bajado el stock. Una vez compremos los vehículos se añadirán al stock*/
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoPalmaPachecoElisa2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoPalmaPachecoElisa2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

}
    

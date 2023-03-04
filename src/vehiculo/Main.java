
package vehiculo;

/**
 *
 * @author Elisa Palma Pacheco
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoPalmaPachecoElisa2223 miVehiculoPalmaPachecoElisa2223;
        int stockActual;
        
        miVehiculoPalmaPachecoElisa2223 = new VehiculoPalmaPachecoElisa2223("Seat",18000,100);
        operativaVehiculosPalmaPachecoElisa2223(miVehiculoPalmaPachecoElisa2223, 50); 
    }

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
    

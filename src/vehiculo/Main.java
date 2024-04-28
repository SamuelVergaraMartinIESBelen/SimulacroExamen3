
package vehiculo;

/**
 * @author Samuel Vergara Martín
 * @version 1.0
 * @since 28-04-2024
 */
public class Main {
    
      /**
       * Inicio del programa
       * @param args 
       */
      public static void main(String[] args) {
        VehiculoSVM2324 miVehiculoSVM2324;
        int stockActual;
        
        miVehiculoSVM2324 = new VehiculoSVM2324("Seat",18000,100);
        operativaVehiculosSVM2324(miVehiculoSVM2324, 50); 
        stockActual = miVehiculoSVM2324.obtenerStock();
        System.out.println("El stock actual es "+ stockActual );
    }

      /**
       * Función que gestiona las compras y ventas de vehiculos
       * @param miVehiculoSVM2324 Vehículo que se desea comprar o vender
       * @param cantidad Numero de vehiculos que se desean comprar o vender
       */
    public static void operativaVehiculosSVM2324(VehiculoSVM2324 miVehiculoSVM2324, Integer cantidad) {
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoSVM2324.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoSVM2324.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
    }

}
    

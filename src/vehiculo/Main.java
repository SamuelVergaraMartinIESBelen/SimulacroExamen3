
package vehiculo;

/**
 *
 * @author 
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoSVM2324 miVehiculoSVM2324;
        int stockActual;
        
        miVehiculoSVM2324 = new VehiculoSVM2324("Seat",18000,100);
        operativaVehiculosSVM2324(miVehiculoSVM2324, 50); 
        stockActual = miVehiculoSVM2324.obtenerStock();
        System.out.println("El stock actual es "+ stockActual );
    }

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
    

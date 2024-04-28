
package vehiculo;

/**
 * @author Samuel Vergara Martín
 * @version 1.0
 * @since 28-04-2024
 */
public class VehiculoSVM2324 {

    /**
     * Atributo que indica el nombre del vehiculo
     */
    private String nombre;
    /**
     * Atributo que indica el precio del vehiculo
     */
    private double precio;
    /**
     * Atributo que indica el precio del vehiculo con el IVA incluido
     */
    private double precioIVA;
    /**
     * Atributo que indica el stock del vehiculo
     */
    private int stock;

    /**
     * Constructor sin argumentos
     */
    public VehiculoSVM2324 ()
    {
    }
    /**
     * Constructor con parámetro para iniciar todas las propiedades de la clase
     * @param nom Nombre del vehiculo
     * @param precio Precio del vehiculo
     * @param stock Stock del vehiculo
     */
    public VehiculoSVM2324 (String nom, double precio, int stock)
    {
        this.nombre =nom;
        this.precio=precio;
        this.stock=stock;
    }
    /**
     * Método para asignar el nombre del vehiculo
     * @param nom Nombre del vehiculo
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
    /**
     * Método que me devuelve el nombre del vehiculo
     * @return el nombre del vehiculo
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     * Método que me devuelve el stock de vehiculos disponible en cada momento
     * @return el stock del vehiculo
     */
     public int obtenerStock ()
    {
        return getStock();
    }

    /** 
     * Método para comprar vehiculos. Modifica el stock.
     * Este método va a ser probado con Junit
     * @param cantidad Cantidad de vehiculos a comprar
     * @throws Exception
     */
    public void comprar(int cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede comprar un nº negativo de vehiculos");
        setStock(getStock() + cantidad);
    }

    /**
     * Método para vender vehiculos.
     * @param cantidad Cantidad de vehiculos a vender.
     * @throws Exception 
     */
    public void vender (int cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede vender una cantidad negativa de vehiculos");
        if (obtenerStock()< cantidad)
            throw new Exception ("No se hay suficientes vehiculos para vender");
        setStock(getStock() - cantidad);
    }

    /**
     * Método de selección del atributo nombre.
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método de acceso del atributo nombre
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método de selección del atributo precio
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Método de acceso del atributo precio
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Método de selección del atributo precioIVA
     * @return the precioIVA
     */
    public double getPrecioIVA() {
        return precioIVA;
    }

    /**
     * Método de acceso del atributo precioIVA
     * @param precioIVA the precioIVA to set
     */
    public void setPrecioIVA(double precioIVA) {
        this.precioIVA = precioIVA;
    }

    /**
     * Método de selección del atributo stock
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * Método de acceso del atributo stock
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
    
}  
   
    


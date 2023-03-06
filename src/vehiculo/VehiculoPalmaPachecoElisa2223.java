
package vehiculo;

/**
 *
 * @author Elisa Palma Pacheco
 */
public class VehiculoPalmaPachecoElisa2223 {

    private String nombre;//Nombre del vehículo
    private double precio;//Precio del vehículo     
    private double precioIVA;//IVA que obtendrá el precio del vehículo
    private int stock;//Número de vehículos disponibles

   /**
     * Constructor sin parámetros.
     */
    public VehiculoPalmaPachecoElisa2223 ()
    {
    }
    /**
     * Constructor basado en el nombre del vehículo, el precio, así como en el stock.
     * @param nom nombre del vehículo
     * @param precio precio del vehículo
     * @param stock cantidad de vehículos para vender
     */
    public VehiculoPalmaPachecoElisa2223 (String nom, double precio, int stock)
    {
        this.nombre =nom;
        this.precio=precio;
        this.stock=stock;
    }
   /**
    * Método para asignar el nombre del vehiculo
    * @param nom nombre del vehículo
    */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
     /**
     * Método que me devuelve el nombre del vehiculo
     * @return Nombre
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

     /**
     * Método que me devuelve el stock de vehiculos disponible en cada momento
     * @return Stock
     */
     public int obtenerStock ()
    {
        return getStock();
    }

    /**
     * Método para comprar vehiculos. Modifica el stock.
     * Este método va a ser probado con Junit
     * @param cantidad cantidad de vehículos que se van a comprar
     */
    public void comprar(int cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede comprar un nº negativo de vehiculos");
        setStock(getStock() + cantidad);
    }
 /**
      * Método para vender  vehiculos. Modifica el stock.
     * Este método va a ser probado con Junit
     * @param cantidad cantidad de vehículos que se van a vender
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
     * Obtiene el nombre del vehículo
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asignar el nombre del vehículo
     * @param nombre nombre que se va a asignar al vehículo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el precio del vehículo
     * @return precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     *  Asignar el precio del vehículo
     * @param precio precio que se va a asignar al vehículo
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el precio IVA del vehículo
     * @return  precioIVA
     */
    public double getPrecioIVA() {
        return precioIVA;
    }

    /**
     *  Asignar el precio IVA del vehículo
     * @param precioIVA precio IVA  que se le va a asignar al vehículo
     */
    public void setPrecioIVA(double precioIVA) {
        this.precioIVA = precioIVA;
    }

    /**
     * Obtiene el stock de vehículos disponibles
     * @return stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * Asignar el stock de vehículos disponibles
     * @param stock 
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
    
}  
   
    


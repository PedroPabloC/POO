public class DeviceSpecs{
    private Brand brand;
    private String model;
    private boolean wifiBuiltIn;
    private boolean bluetoothwifiBuiltIn; 


    /**
     * Constructor por defecto de la clase
     */
    public DeviceSpecs(){
        this.brand = null;
        this.model = null;
        this.wifiBuiltIn = false;
        this.bluetoothwifiBuiltIn = false;

    }


    /**
     * Constructor con parametros de la clase
     * @param brand
     * @param model
     * @param wifiBuiltIn
     * @param bluetoothwifiBuiltIn
     */
    public DeviceSpecs(Brand brand, String model, boolean wifiBuiltIn, boolean bluetoothwifiBuiltIn){
        this.brand = brand;
        this.model = model;
        this.wifiBuiltIn = wifiBuiltIn;
        this.bluetoothwifiBuiltIn = bluetoothwifiBuiltIn;
    }


    /**
     * Set brand
     * @param brand
     */
    public void setBrand(Brand brand){
        this.brand = brand;
    }


    /**
     * Get brand
     * @return
     */
    public Brand getBrandName(){
        return brand;
    }


    /**
     * toString especializado de la clase, engloba los atributos correspondientes
     * @return El String de todos los parametros
     */
    public String toString(){
        String output;
        output = "model: " + this.model +"\n" +
                 "wifiBuiltIn: " + this.wifiBuiltIn + "\n"+
                 "bluetoothwifiBuiltIn: " + this.bluetoothwifiBuiltIn + "\n" +
                 "Brand: " + this.brand.getBrandName()+ "\n";
        return output;
    }
}
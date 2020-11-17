public class DeviceSpecs{
    //private Brand brand;
    private String model;
    private boolean wifiBuiltIn;
    private boolean bluetoothwifiBuiltIn; 

    public DeviceSpecs(){
        //this.brand = null;
        this.model = null;
        this.wifiBuiltIn = false;
        this.bluetoothwifiBuiltIn = false;

    }

    public DeviceSpecs(/*Brand brand,*/String model, boolean wifiBuiltIn, boolean bluetoothwifiBuiltIn){
        //this.brand = brand;
        this.model = model;
        this.wifiBuiltIn = wifiBuiltIn;
        this.bluetoothwifiBuiltIn = bluetoothwifiBuiltIn;
    }

    /*public void setBrand(Brand brand){
        this.brand = brand;
    }*/

    /*public Brand getBrandName(){
        return brand;
    }*/

    public String toString(){
        String output;
        output = "model: " + this.model +"\n" +
                 "wifiBuiltIn: " + this.wifiBuiltIn + "\n"+
                 "bluetoothwifiBuiltIn: " + this.bluetoothwifiBuiltIn + "\n" /*+
                 "Brand: " + this.brand.getBrandName()+ "\n"*/;
        return output;
    }
}
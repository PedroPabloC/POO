public class Device {
    private int Id;
    private boolean Status;
    private String Name;
    private DeviceSpecs deviceSpecs;


    /**
     * Constructor por defecto de la clase
     */
    public Device() {
        this.Id = 0;
        this.Status = false;
        this.Name = null;
        this.deviceSpecs = null;
    }


    /**
     * Constructor de la clase con parametros
     * @param Id
     * @param Status
     * @param Name
     * @param deviceSpecs
     */
    public Device(int Id, boolean Status, String Name, DeviceSpecs deviceSpecs) {
        this.Id = Id;
        this.Status = Status;
        this.Name = Name;
        this.deviceSpecs = deviceSpecs;
    }


    /**
     * 
     * @return int
     */
    public int getId() {
        return Id;
    }


    /**
     * 
     * @return boolean
     */
    public boolean getStatus(){
        return Status;
    }


    /**
     * 
     * @return String
     */
    public String getName(){
        return Name;
    }


    /**
     * 
     * @return DeviceSpecs
     */
    public DeviceSpecs getDeviceSpecs(){
        return deviceSpecs;
    }

    
    /**
     * Set id
     * @param id
     */
    public void setId(int id){
        this.Id = id;
    }


    /**
     * Set status
     * @param status
     */
    public void setStatus(boolean status) {
        this.Status = status;
    }
    

    /**
     * Set name
     * @param Name
     */
    public void setName(String Name){
        this.Name = Name;
    }
    

    /**
     * Set deviceSpecs
     * @param deviceSpecs
     */
    public void setDeviceSpecs(DeviceSpecs deviceSpecs){
        this.deviceSpecs = deviceSpecs;
    }


    /**
     * toString modificado para la clase 
     * @return String de todos los atributos de la clase
     */
    public String toString(){
        String output;
        output = "ID: " + this.Id +"\n" +
                "Status: " + this.Status + "\n"+
                "Name: " + this.Name + "\n" +
                "DeviceSpecs: " + this.getDeviceSpecs();
        return output;
    }


    /**
     * Clase por defecto modificada que compara dos dispostivos
     * @return Boolean
     */
    public boolean equals(Object o){
        boolean result = false;
        if((o != null) && (o instanceof Device)){
            Device d = (Device) o;
            if((Id == d.Id) && (Name.equals(d.Name))&&(deviceSpecs.equals(d.deviceSpecs))){
                result = true;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Brand brand = Brand.LG;
        DeviceSpecs testSpecs = new DeviceSpecs(brand,"top", true, true);
        Device device = new Device(0, true, "AC", testSpecs);
        
        System.out.println(device);
        
    }

}    
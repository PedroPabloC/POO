public class Device {
    private int Id;
    private boolean Status;
    private String Name;
    private Brand brand ;
    private DeviceSpecs deviceSpecs;
    private  boolean deviceFlag;

    public Device() {
        this.Id = 0;
        this.Status = false;
        this.Name = null;
        this.brand = null;
        this.deviceSpecs = null;
        this.deviceFlag = false;
    }

    public Device(int Id, boolean Status, String Name, Brand brand, DeviceSpecs deviceSpecs) {
        this.Id = Id;
        this.Status = Status;
        this.Name = Name;
        this.brand = brand;
        this.deviceSpecs = deviceSpecs;
        this.deviceFlag = true;
    }

    public int getId() {
        return Id;
    }

    public boolean getStatus(){
        return Status;
    }

    public String getName(){
        return Name;
    }

    public Brand getBrand() {
        return brand;
    }

    public DeviceSpecs getDeviceSpecs(){
        return deviceSpecs;
    }

    public boolean getFlag(){
        return deviceFlag;
    }
    
    public void setId(int id){
        this.Id = id;
    }

    public void setStatus(boolean status) {
        this.Status = status;
    }
    
    public void setName(String Name){
        this.Name = Name;
    }
    
    public void setBrand(Brand brand){
        this.brand = brand;
    }

    public void setDeviceSpecs(DeviceSpecs deviceSpecs){
        this.deviceSpecs = deviceSpecs;
    }

    public String toString(){
        String output;
        output = "ID: " + this.Id +"\n" +
                "Status: " + this.Status + "\n"+
                "Name: " + this.Name + "\n" +
                "Brand: " + this.brand.getBrandName()+ "\n" +
                "DeviceSpecs: " + this.getDeviceSpecs() +
                "Device flag: " + this.deviceFlag;
        return output;
    }

    public boolean equals(Device device){
        boolean result = false;
        if((device != null) && (device instanceof Device)){
            Device d = (Device) device;
            if((Id == d.Id) && (Status == d.Status)&&(Name == d.Name)&&(brand == d.brand)&&(deviceSpecs == d.deviceSpecs)){
                result = true;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Brand brand = Brand.LG;
        DeviceSpecs testSpecs = new DeviceSpecs("top", true, true);
        Device device = new Device(0, true, "AC", brand, testSpecs);
        
        System.out.println(device);
        
    }

}    
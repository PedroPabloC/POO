public class Inventory{
    private Device devices[] = new Device[20];


    public Inventory(){
        int i = 0;
        for(i=0; i<20; i++){
            devices[i] = new Device();
        }
    }



    public void addDevice(Device device){
        int i = 0;
        boolean flag = false;
        for(i = 0; i<20 && flag ==false; i++){
            if(devices[i].getFlag() == false){
                devices[i] = device;
                flag = true;
            }
        }
    }

    public Device getDevice(int id){
        int i = 0;
        boolean flag = false;
        Device aux = null;
        for(i = 0; i<20 && flag==false; i++){
            if(devices[i].getId()==id){
                aux = devices[i];
                flag = true;
            }
        }
        return aux;
    }

    public Device searchDevice(Device device){
        int i = 0;
        boolean flag = false;

        for(i = 0; i<20 && flag==false; i++){
            if(this.devices[i].equals(device)==true){
                flag = true;
            }
        }

        if (flag == true){
                System.out.println("Existe en la lista");
                return device;
        }
        else{
            System.out.println("false");
            return null;
        }
    }


    public void createInventory(){
        DeviceSpecs testingSpecs = new DeviceSpecs("top", true, true);
        Brand brand = Brand.LG;
        Device device0 = new Device(0, true, "AC", brand, testingSpecs);
        devices[0] = device0;
        Device device1 = new Device(1, false, "TV", Brand.PANASONIC, testingSpecs);
        devices[1] = device1;
        Device device2 = new Device(2, false, "AC", Brand.LG, testingSpecs);
        devices[2] = device2;
        Device device3 = new Device(3, false, "Lamp", Brand.LG, testingSpecs);
        devices[3] = device3;
        Device device4 = new Device(4, false, "Cam", Brand.DAEWO, testingSpecs);
        devices[4] = device4;
    }
    
}
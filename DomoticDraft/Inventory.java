public class Inventory{
    private Device devices[];


    /**
     * Constructor por defecto de la clase Inventory
     */
    public Inventory(){
        devices = new Device[4];
    }

    
    /**
     * Agrega un dispositivo al arreglo de disposivos
     * @param device
     */
    public void addDevice(Device device){
        devices = moreInventory(devices);
        devices[devices.length-1] = device;
    }

    public void removeDevice(Device device){
        boolean flag = false;
        int auxiliar = 0;
        for(int i = 0; i<devices.length; i++){
            if (devices[i].equals(device)){
                flag = true;
                auxiliar = i;
            }
        }
    
        if(flag == true){
            Device decMemory[] = new Device[devices.length-1];
            for(int i = auxiliar; i<devices.length-1; i++){
                devices[i] = devices[i+1];
            }

            for(int i = 0; i<devices.length-1;i++){
                decMemory[i] = devices[i];
            }

            devices = decMemory;


            
        }
    }

    
  /**
   * 
   * @param devices
   * @return Devuelve el arreglo de dispositivos aumentado en 1
   */
    public Device[] moreInventory(Device devices[]){
        Device incMemory[] = new Device[devices.length+1];

        for(int i = 0; i < devices.length; i++){
            incMemory[i] = devices[i];
        }
        return incMemory;
    }

    /**
     * 
     * @param device
     * @return El índice del dispositivo a buscar
     */

    public int searchDevice(Device device){
        int index = -1;
        for (int i = 0; i < devices.length; i++){
            if (devices[i].equals(device)){
                index = i;
                break;
            }
        }
        return index;
    }

    
    /** 
     * @return El String del conjunto de dispositivos
     */
    public String toString(){
        String output = " ";
        for(int i = 0; i<devices.length; i++){
            output = output + devices[i].toString() + "\n";
        }
        return output;
    }


    /**
     * Crea un inventario de dispositivos
     */


    public void createInventory(){
        DeviceSpecs specs0 = new DeviceSpecs(Brand.CARRIER, "ABC", true, true);
        DeviceSpecs specs1 = new DeviceSpecs(Brand.DAEWO, "CDF", true, false);
        DeviceSpecs specs2 = new DeviceSpecs(Brand.SAMSUNG, "KLM0", false, true);
        DeviceSpecs specs3 = new DeviceSpecs(Brand.PANASONIC, "BCP33", false, false);

        Device device0 = new TV(0, true, "TV H1", specs0, 23, true);
        devices[0] = device0;
        Device device1 = new AC(1, true, "AC H4", specs1, 50, 15);
        devices[1] = device1;
        Device device2 = new Lamp(2, true, "LMP H1", specs2, "Ahorrador", 110);
        devices[2] = device2;
        Device device3 = new Cam(3, true, "CAM H3", specs3, true, "24/7", "1234b" );
        devices[3] = device3;

    }
    
}
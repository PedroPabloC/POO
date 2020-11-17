public class Main{

    public static void main(String[] args) {
        
        Inventory inventory = new Inventory();
        inventory.createInventory();

        DeviceSpecs testingSpecs = new DeviceSpecs("top", true, true);
        Device device = new Device(0, true, "AC", Brand.LG, testingSpecs);

        inventory.searchDevice(device);

    
    }
}
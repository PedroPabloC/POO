/**
 * Clase main en la que hacemos las pruebas de todas las clases y funciones respectivas a este proyecto
 */
public class Main{
    public static void main(String[] args) {
        
        Inventory inventory = new Inventory();
        inventory.createInventory();

        DeviceSpecs specs3 = new DeviceSpecs(Brand.PANASONIC, "BCP33", false, false);
        Device devicePrueba = new Cam(3, true, "CAM H3", specs3, true, "24/7", "1234b" );
        inventory.addDevice(devicePrueba);

       
        System.out.println(inventory.searchDevice(devicePrueba));



    
    }
}
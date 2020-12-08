/**
 * Clase main en la que hacemos las pruebas de todas las clases y funciones respectivas a este proyecto
 */
public class Main{
    public static void main(String[] args) {
        
        Inventarios<Device> inventory = new Inventarios<Device>();
        //inventory.createInventory();

        /*
        Creación de objetos a probar
        */
        DeviceSpecs specs3 = new DeviceSpecs(Brand.PANASONIC, "BCP33", false, false);
        Device devicePrueba = new Cam(4, true, "CAM H3", specs3, true, "24/7", "1234b" );
        Device devicePrueba2 = new TV(5, true, "TV prueba", specs3, 20, true);
        inventory.add(devicePrueba);
        inventory.add(devicePrueba2);

       
        System.out.println(inventory.search(devicePrueba));
        System.out.println(inventory);
        inventory.remove(devicePrueba);
        System.out.println(inventory.search(devicePrueba));
        System.out.println(inventory);


        Room cuartoUno = new Room("Cuato 1", 1, 10, inventory);
        Inventarios<Room> inventoryRooms = new Inventarios<Room>();
        inventoryRooms.add(cuartoUno);

        Spot espacioNumeroUno = new Spot("Espacio 1", 1, 20, inventoryRooms);

        System.out.println(espacioNumeroUno.buscarHabitacion(cuartoUno));
        System.out.println(espacioNumeroUno.buscarDispositivoEnHabitacion(devicePrueba2));



    
    }
}
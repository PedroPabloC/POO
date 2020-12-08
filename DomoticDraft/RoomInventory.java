public class RoomInventory {
    private String nombreInventario;
    private Room rooms[];




/**
 * Constructor por defecto
 */
public RoomInventory(){
    this.nombreInventario = null;
    this.rooms = null;
}

/**
 * Constructor con parametros de la clase
 * @param nombreInventario
 * @param devices
 */

public RoomInventory(String nombreInventario, Room rooms[]){
    this.nombreInventario = nombreInventario;
    this.rooms = rooms;
}

public void addDevice(Room room){
    rooms = moreInventory(rooms);
    rooms[rooms.length-1] = room;
}


public void removeDevice(Room room){
    boolean flag = false;
    int auxiliar = 0;
    for(int i = 0; i<rooms.length; i++){
        if (rooms[i].equals(room)){
            flag = true;
            auxiliar = i;
        }
    }

    if(flag == true){
        Room decMemory[] = new Room[rooms.length-1];
        for(int i = auxiliar; i<rooms.length-1; i++){
            rooms[i] = rooms[i+1];
        }

        for(int i = 0; i<rooms.length-1;i++){
            decMemory[i] = rooms[i];
        }

        rooms = decMemory;


        
    }
}


/**
* 
* @param Rooms
* @return Devuelve el arreglo de dispositivos aumentado en 1
*/
public Room[] moreInventory(Room rooms[]){
    Room incMemory[] = new Room[rooms.length+1];

    for(int i = 0; i < rooms.length; i++){
        incMemory[i] = rooms[i];
    }
    return incMemory;
}

/**
 * 
 * @param device
 * @return El índice del dispositivo a buscar
 */

public int searchDevice(Room room){
    int index = -1;
    for (int i = 0; i < rooms.length; i++){
        if (rooms[i].equals(room)){
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
    for(int i = 0; i<rooms.length; i++){
        output = output + rooms[i].toString() + "\n";
    }
    return output;
}


}

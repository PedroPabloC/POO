public class Spot implements RoomInterface {
    private String nombreEspacio;
    private int idEspacio;
    private int nivel;
    private Inventarios<Room> roomInventory;



    public Spot(){
        this.nombreEspacio = null;
        this.idEspacio = 0;
        this.nivel = 0;
        this.roomInventory = null;
    }

    public Spot(String nombreEspacio, int idEspacio, int nivel, Inventarios<Room> roomInventory){
        this.nombreEspacio = nombreEspacio;
        this.idEspacio = idEspacio;
        this.nivel = nivel;
        this.roomInventory = roomInventory;  
    }


    public void configurarEspacio(){
        System.out.println("No sé qué hago");
    }

    public void setNombreEspacio(String nombreEspacio){
        this.nombreEspacio = nombreEspacio;
    }

    public void setIdEspacio(int idEspacio){
        this.idEspacio = idEspacio;
    }

    public void setNivel(int nivel){
        this.nivel = nivel;
    }

    public String getNombreEspacio(){
        return nombreEspacio;
    }

    public int getIdEspacio(){
        return idEspacio;
    }

    public int getNivel(){
        return nivel;
    }

    public Inventarios<Room> getRoomInventory(){
        return roomInventory;
    }

    public int buscarDispositivoEnHabitacion(Device dispositivo){
        Room aux[] = new Room[roomInventory.getLista().length];
        aux = roomInventory.getLista();
        int index = 0;


        for(int i = 0; i<roomInventory.getLista().length; i++){
            Inventarios <Device> aux2 = aux[i].getInventario();
            index =  aux2.search(dispositivo);
        }

        return index;
    }

    public int buscarHabitacion(Room habitacion){
        int auxiliar = -1;
        roomInventory.search(habitacion);
        return auxiliar;
    }

}


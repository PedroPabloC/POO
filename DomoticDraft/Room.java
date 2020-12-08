public class Room {
    private String nombreHabitacion;
    private int idHabitacion;
    private int nivel;
    private Inventarios<Device> inventory;

    public Room(){
        this.nombreHabitacion = null;
        this.idHabitacion = 0;
        this.nivel = 0;
        this.inventory = null;
    }

    public Room(String nombreHabitacion, int idHabitacion, int nivel, Inventarios <Device> inventario){
        this.nombreHabitacion = nombreHabitacion;
        this.idHabitacion = idHabitacion;
        this.nivel = nivel;
        this.inventory= inventario;
    }

    public String getNombreHabitacion(){
        return nombreHabitacion;
    }

    public int getIdHabitacion(){
        return idHabitacion;
    }

    public int getNivel(){
        return nivel;
    }

    public Inventarios<Device> getInventario(){
        return inventory;
    }

    public void setNombreHabitacion(String nombreHabitacion){
        this.nombreHabitacion = nombreHabitacion;
    }

    public void setIdHabitacion(int idHabitacion){
        this.idHabitacion = idHabitacion;
    }

    public void setNivel(int nivel){
        this.nivel = nivel;
    }

    public void setInventario(Inventarios<Device> inventario){
        this.inventory = inventario;
    }

    public void cambiarNombreHabitacion(String nombreHabitacion){
        setNombreHabitacion(nombreHabitacion);
    }

    public boolean equals(Object o){
        boolean result = false;
        if((o != null) && (o instanceof Room)){
            Room d = (Room) o;
            if((nombreHabitacion.equals(d.nombreHabitacion)) && (idHabitacion == d.idHabitacion)&&(nivel == d.nivel)&&(inventory.equals(d.inventory))){
                result = true;
            }
        }
        return result;
    }

}

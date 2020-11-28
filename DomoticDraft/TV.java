public class TV extends Device {
    private int tiempoEncendido;
    private boolean candado;
    

    /**
     * Constructor por defecto de la clase
     */
    public TV(){
        super();
        this.tiempoEncendido = 0;
        this.candado = false;
    }


    /**
     * Constructor con parametros de la clase
     * @param Id
     * @param Status
     * @param Name
     * @param deviceSpecs
     * @param tiempoEncendido
     * @param candado
     */
    public TV(int Id, boolean Status, String Name, DeviceSpecs deviceSpecs,int tiempoEncendido, boolean candado){
        super(Id, Status, Name, deviceSpecs);
        this.tiempoEncendido = tiempoEncendido;
        this.candado = candado;
    }


    /**
     * Set tiempo encedido
     * @param tiempoEncendido
     */
    public void setTiempoEncendido(int tiempoEncendido){
        this.tiempoEncendido = tiempoEncendido;
    }


    /**
     * Set candado
     * @param candado
     */
    public void setCandado(boolean candado){
        this.candado = candado;
    }


    /**
     * Devuelve el entero que representa al tiempo total en el que ha estado encendido el dispositivo
     * @return int
     */
    public int getTiempoEncendido(){
        return tiempoEncendido;
    }


    /**
     * Devuelve el candado que es un booleano 
     * @return boolean
     */
    public boolean getCandado(){
        return candado;
    }


    /**
     * Función que simula la prohibición de la TV por medio del candado
     */
    public void prohibirTV(){
        System.out.println("Soy una función que impide prenderse a la TV");
    }


    /**
     * toString especializado de la clase
     * @return El String con todos los atributos de un dipositivo más los adicionales de la clase
     */
    public String toString() {
        String output = "";

        output = super.toString() + "Tiempo encendido: " + this.tiempoEncendido + "\n" + 
        "Candado: " + this.candado;

        return output;
    }


    /**
     * Clase que compara dos dispositivos de tipo TV y devuelve verdadero si son equivalentes
     * @param Object
     * @return boolean 
     */
    public boolean equals(Object o){
        boolean result = false;
        
        if((o != null) && (o instanceof Device) && (o instanceof TV)){
            Device device = (Device)o;
            TV tv = (TV)o;
            if (super.equals(device) && 
            tiempoEncendido == tv.tiempoEncendido&&
            candado == tv.candado){
                result = true;
            } 
        }
        return result;
    }
}

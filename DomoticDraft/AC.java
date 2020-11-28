public class AC extends Device{
    private int tiempoEncendido;
    private int temperatura;


    /**
     * Constructor por defecto de la clase
     */
    public AC(){
        super();
        this.tiempoEncendido = 0;
        this.temperatura = 0;
    }


    /**
     * Constructor con parametros de la clase
     * @param Id
     * @param Status
     * @param Name
     * @param deviceSpecs
     * @param tiempoEncendido
     * @param temperatura
     */
    public AC(int Id, boolean Status, String Name, DeviceSpecs deviceSpecs, int tiempoEncendido, int temperatura){
        super(Id, Status, Name, deviceSpecs);
        this.tiempoEncendido = tiempoEncendido;
        this.temperatura = temperatura;
    }


    /**
     * Set int del tiempo encendido
     * @param tiempoEncendido
     */
    public void setTiempoEncendido(int tiempoEncendido){
        this.tiempoEncendido = tiempoEncendido;
    }


    /**
     * Set int temperatura
     * @param temperatura
     */
    public void setTemperatura(int temperatura){
        this.temperatura = temperatura;
    }


    /**
     * Devuelve el tiempo encedido total del dispositivo
     * @return int tiempoEncendido
     */
    public int getTiempoEncendido(){
        return tiempoEncendido;
    }


    /**
     * Devuelve la temperatura actual del ambiente
     * @return int temperatura
     */
    public int getTemperatura(){
        return temperatura;
    }


    /**
     * Funcion que monitorea la temperatura
     */
    public void monitoreoAC(){
        System.out.println("Soy una función que monitorea mis atributos");
    }


    /**
     * String especializado
     * @return El String de todos los atributos de la clase heredada AC
     */
    public String toString() {
        String output = "";

        output = super.toString() + "Tiempo encendido: " + this.tiempoEncendido + "\n" + 
        "Temperatura: " + this.temperatura;

        return output;
    }


    /**
     * Clase que compara dos dispositivos de tipo AC y devuelve verdadero si son equivalentes
     * @param Object
     * @return boolean 
     */
    public boolean equals(Object o){
        boolean result = false;
        
        if((o != null) && (o instanceof Device) && (o instanceof AC)){
            Device device = (Device)o;
            AC aireAcondicionado = (AC)o;
            if (super.equals(device) && 
            tiempoEncendido == aireAcondicionado.tiempoEncendido &&
            temperatura == aireAcondicionado.temperatura){
                result = true;
            } 
        }
        return result;
    }

}

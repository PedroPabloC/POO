public class Lamp extends Device {
    private String tipo;
    private int voltaje;


    /**
     * Constructor por defecto de la clase
     */
    public Lamp(){
        super();
        this.tipo = null;
        this.voltaje = 0;
    }


    /**
     * Constructor con parametros de la clase
     * @param Id
     * @param Status
     * @param Name
     * @param deviceSpecs
     * @param tipo
     * @param voltaje
     */
    public Lamp(int Id, boolean Status, String Name, DeviceSpecs deviceSpecs, String tipo, int voltaje){
        super(Id, Status, Name, deviceSpecs);
        this.tipo = tipo;
        this.voltaje = voltaje;
    }


    /**
     * Set tipo
     * @param tipo
     */
    public void setTipo(String tipo){
        this.tipo = tipo;
    }


    /**
     * Set voltaje
     * @param voltaje
     */
    public void setVoltaje(int voltaje){
        this.voltaje = voltaje;
    }


    /**
     * Devuelve el tipo
     * @return String
     */
    public String getTipo(){
        return tipo;
    }


    /**
     * Devuelve el voltaje
     * @return int
     */
    public int getVoltaje(){
        return voltaje;
    }


    /**
     * toString especializado de la clase
     * @return El String con todos los atributos de un dipositivo más los adicionales de la clase
     */
    public String toString() {
        String output = "";

        output = super.toString() + "Tipo: " + this.tipo + "\n" + 
        "Voltaje: " + this.voltaje;

        return output;
    }


    /**
     * Clase que compara dos dispositivos de tipo Lamp y devuelve verdadero si son equivalentes
     * @param Object
     * @return boolean 
     */
    public boolean equals(Object o){
        boolean result = false;
        
        if((o != null) && (o instanceof Device) && (o instanceof Lamp)){
            Device device = (Device)o;
            Lamp lampara = (Lamp)o;
            if (super.equals(device) && 
            tipo.equals(lampara.tipo) &&
            voltaje == lampara.voltaje){
                result = true;
            } 
        }
        return result;
    }
}

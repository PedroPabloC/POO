public class Cam extends Device {
    private boolean candado;
    private String tipo;
    private String password;


    /**
     * Constructor por defecto de la clase
     */
    public Cam(){
        super();
        this.candado = false;
        this.tipo = null;
        this.password = null;
    }


    /**
     * Constructor con parametros de la clase
     * @param Id
     * @param Status
     * @param Name
     * @param deviceSpecs
     * @param candado
     * @param tipo
     * @param password
     */
    public Cam(int Id, boolean Status, String Name, DeviceSpecs deviceSpecs,boolean candado, String tipo, String password){
        super(Id, Status, Name, deviceSpecs);
        this.candado = candado ;
        this.tipo = tipo ;
        this.password = password;
    }


    /**
     * Devuelve el candado
     * @return boolean
     */
    public boolean getCandado(){
        return candado;
    }


    /**
     * Devuelve el tipo
     * @return String
     */
    public String getTipo(){
        return tipo;
    }


    /**
     * Devuelve la contraseña de la camara
     * @return String
     */
    public String getPassword(){
        return password;
    }


    /**
     * Función especializada de la clase
     */
    public void specialFunc(){
        System.out.println("Función especial para este tipo de dispositivos");
    }


    /**
     * toString especializado de la clase
     * @return El String con todos los atributos de un dipositivo más los adicionales de la clase
     */
    public String toString() {
        String output = "";

        output = super.toString() + "Candado " + this.candado + "\n" + 
        "Tipo: " + this.tipo + "\n" + 
        "Password: " + this.password;

        return output;
    }


    /**
     * Clase que compara dos dispositivos de tipo Cam y devuelve verdadero si son equivalentes
     * @param Object
     * @return boolean 
     */
    public boolean equals(Object o){
        boolean result = false;
        
        if((o != null) && (o instanceof Device) && (o instanceof Cam)){
            Device device = (Device)o;
            Cam camara = (Cam)o;
            if (super.equals(device) && 
            candado == camara.candado &&
            tipo.equals(camara.tipo)&&
            password.equals(camara.password)){
                result = true;
            } 
        }
        return result;
    }
}

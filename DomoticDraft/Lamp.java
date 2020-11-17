public class Lamp extends Device {
    private String tipo;
    private int voltaje;

    public Lamp(){
        this.tipo = null;
        this.voltaje = 0;
    }

    public Lamp(String tipo, int voltaje){
        this.tipo = tipo;
        this.voltaje = voltaje;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setVoltaje(int voltaje){
        this.voltaje = voltaje;
    }

    public String getTipo(){
        return tipo;
    }

    public int getVoltaje(){
        return voltaje;
    }
}

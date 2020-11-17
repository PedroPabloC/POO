public class AC extends Device{
    private int energia;
    private int tamanio; 
    private int tiempoEncendido;
    private int temperatura;



    public AC(){
        this.energia =0;
        this.tamanio = 0;
        this.tiempoEncendido = 0;
        this.temperatura = 0;
    }

    public AC(int energia, int tamanio, int tiempoEncendido, int temperatura){
        this.energia = energia;
        this.tamanio = tamanio;
        this.tiempoEncendido = tiempoEncendido;
        this.temperatura = temperatura;
    }

    public void setEnergia(int energia){
        this.energia = energia;
    }

    public void setTamanio(int tamanio){
        this.tamanio = tamanio;
    }

    public void setTiempoEncendido(int tiempoEncendido){
        this.tiempoEncendido = tiempoEncendido;
    }

    public void setTemperatura(int temperatura){
        this.temperatura = temperatura;
    }

    public int getEnergia(){
        return energia;
    }

    public int getTamanio(){
        return tamanio;
    }

    public int getTiempoEncendido(){
        return tiempoEncendido;
    }

    public int getTemperatura(){
        return temperatura;
    }

    public void monitoreoAC(){
        System.out.println("Soy una función que monitorea mis atributos");
    }

}

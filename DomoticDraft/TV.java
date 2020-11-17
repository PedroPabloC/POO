public class TV extends Device {
    private int tiempoEncendido;
    private boolean candado;
    
    public TV(){
        this.tiempoEncendido = 0;
        this.candado = false;
    }

    public TV(int tiempoEncendido, boolean candado){
        this.tiempoEncendido = tiempoEncendido;
        this.candado = candado;
    }

    public void setTiempoEncendido(int tiempoEncendido){
        this.tiempoEncendido = tiempoEncendido;
    }

    public void setCandado(boolean candado){
        this.candado = candado;
    }

    public int getTiempoEncendido(){
        return tiempoEncendido;
    }

    public boolean getCandado(){
        return candado;
    }

    public void prohibirTV(){
        System.out.println("Soy una función que impide prenderse a la TV");
    }
}

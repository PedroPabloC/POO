public class Cam extends Device {
    private boolean candado;
    private String tipo;
    private String password;

    public Cam(){
        this.candado = false;
        this.tipo = null;
        this.password = null;
    }

    public Cam(boolean candado, String tipo, String password){
        this.candado = candado ;
        this.tipo = tipo ;
        this.password = password;
    }

    public boolean getCandado(){
        return candado;
    }

    public String getTipo(){
        return tipo;
    }

    public String getPassword(){
        return password;
    }

    public void specialFunc(){
        System.out.println("Función especial para este tipo de dispositivos");
    }
}

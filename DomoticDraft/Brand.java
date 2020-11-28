/**
 * Este es un enum que declara los strings constantes relacionados a las marcas de los dispositivos
 */
public enum Brand{
    LG("LG"), PANASONIC("Panasonic"), DAEWO("Daewo"), CARRIER("Carrier"), SAMSUNG("Samsung");
    public final String brandName;
    public final int brandCode;
    

    /**
     * Constructor por defecto de la clase
     * @param brandName
     */
    Brand (String brandName){
        this.brandName = brandName;
        this.brandCode = -1;
    }
/*
    Brand (String brandName, int brandCode){
        this.brandName = brandName;
        this.brandCode = brandCode;
    }
*/

    /**
     * Devuelve el nombre de la marca
     * @return String
     */
    public String getBrandName(){
        return brandName;
    }


    /**
     * Devuelve el entero de la marca
     * @return int
     */
    public int getBrandCode(){
        return brandCode;
    }

    /*public String toString(){
        String output = null;
        switch(this){
            case LG: output ="LG"; break;
            case PANASONIC: output ="Panasonic"; break;
            case DAEWO: output ="Daewo"; break;
            case CARRIER: output ="Carrier"; break;
        }
        return output;
    }*/
}
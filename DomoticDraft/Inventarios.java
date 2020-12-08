public class Inventarios<T> {
    private String nombreInventario;
    private Object inventarios[];




/**
 * Constructor por defecto
 */
public Inventarios(){
    this.nombreInventario = null;
    this.inventarios = (T[]) new Object[0];
}

/**
 * Constructor con parametros de la clase
 * @param nombreInventario
 * @param inventarios
 */

public Inventarios(String nombreInventario, T inventarios[]){
    this.nombreInventario = nombreInventario;
    this.inventarios = inventarios;
}

public T[] getLista(){
    return (T[])inventarios;
}

public void add(T t){
    inventarios = moreInventory((T[])inventarios);
    inventarios[inventarios.length-1] = t;
}


public void remove(T t){
    boolean flag = false;
    int auxiliar = 0;
    for(int i = 0; i<inventarios.length; i++){
        if (inventarios[i].equals(t)){
            flag = true;
            auxiliar = i;
        }
    }

    if(flag == true){
        Object decMemory[] = (T[]) new Object[inventarios.length-1];
        for(int i = auxiliar; i<inventarios.length-1; i++){
            inventarios[i] = inventarios[i+1];
        }

        for(int i = 0; i<inventarios.length-1;i++){
            decMemory[i] = inventarios[i];
        }

        inventarios = decMemory;


        
    }
}


/**
* 
* @param inventarios[]
* @return Devuelve el arreglo de dispositivos aumentado en 1
*/
public T[] moreInventory(T inventarios[]){
    Object incMemory[] = (T[]) new Object[inventarios.length+1];

    for(int i = 0; i < inventarios.length; i++){
        incMemory[i] = inventarios[i];
    }
    return (T[])incMemory;
}

/**
 * 
 * @param device
 * @return El índice del dispositivo a buscar
 */

public int search(T t){
    int index = -1;
    for (int i = 0; i < inventarios.length; i++){
        if (inventarios[i].equals(t)){
            index = i;
            break;
        }
    }
    return index;
}


/** 
 * @return El String del conjunto de dispositivos
 */
public String toString(){
    String output = " ";
    for(int i = 0; i<inventarios.length; i++){
        output = output + inventarios[i].toString() + "\n";
    }
    return output;
}


}



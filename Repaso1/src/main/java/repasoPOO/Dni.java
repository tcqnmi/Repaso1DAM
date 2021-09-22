

package repasoPOO;

import java.util.Random;


public class Dni {
    
    Random rnd = new Random ();
    
    private String dni = "no asignado";

    public Dni() {
        
    }
    
    public void generar(){
   
        int numero = rnd.nextInt(99999999)+1000000;
        String  opciones [] = {"T","R","W","A","G","M","Y", "F","P","D","X","B","N", "J","Z","S","Q","V","H","L","C","K","E"};
        int posicion = numero%23;                 
        String letra = opciones[posicion];
        this.dni= String.format("%d-%s" ,numero, letra);
            
       
    }
    
    public String getDni(){
        return this.dni;
    }
    
    
     
}




package repasoPOO;

import java.util.Random;


public class Dni {
    
    Random rnd = new Random ();
    
        public  String generarDni(){

            
            int numero = rnd.nextInt(99999999);
            
            
            return String.format("%d - %s" ,numero, averiguarLetra(numero));
        }
        private  String averiguarLetra(int dni){
           
            String  opciones [] = {"T","R","W","A","G","M","Y", "F","P","D","X","B","N", "J","Z","S","Q","V","H","L","C","K","E"};
            int posicion = dni%23;                 
            String letra = opciones[posicion];

            return letra; 
    }
        
}


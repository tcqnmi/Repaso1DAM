
package repasoPOO;

import java.util.Scanner;

public class Main {
    
  
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("¿Cuántas personas vas a guardar?");
        int num = Integer.parseInt(teclado.nextLine());
        
        Persona arrayPersona [] = new Persona [num];
        
        for (int i = 0; i < num; i++) {
            arrayPersona[i] = new Persona();
            System.out.printf("Persona %d: %s \n ",i+1, arrayPersona[i].toString());
        }
       
        
    }
    
    
    
}

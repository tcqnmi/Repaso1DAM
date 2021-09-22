
package repasoPOO;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    
  
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        
        ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
   
        System.out.printf("El array tiene %d personas \n",listaPersonas.size());
        System.out.println("¿Cuántas personas vas a guardar?");
        int num = Integer.parseInt(teclado.nextLine());
        
        for (int i = 0; i < num; i++) {
            Persona p1 = new Persona();
            listaPersonas.add(p1);   
        }
       
        System.out.printf("El array tiene %d personas\n",listaPersonas.size());
        
        for (int i = 0; i < listaPersonas.size(); i++) {
            System.out.printf("La persona nº %d tiene una altura de %.2f, pesa: %.2f, su edad es: %d, su IMC es: %.2f, su DNI es: %s \n",
                    i, listaPersonas.get(i).getAltura(), listaPersonas.get(i).getPeso(), 
                    listaPersonas.get(i).getEdad(), listaPersonas.get(i).getIMC(),listaPersonas.get(i).getDni());   
        }
        /*
        1.- Tenemos que importar las ArrayList
        
        2.- Escribimos:  ArrayList<tipode datos a introducir> nombre de la lista = new ArrayList<tipo datos>();  
        
        listaPersonas.get(i) seria la persona de la posicion i 
                
        Aquí está hecho con un array de objetos porque no habíamos dado arraylists
        
        System.out.println("¿Cuántas personas vas a guardar?");
        int num = Integer.parseInt(teclado.nextLine());
        
        Persona arrayPersona [] = new Persona [num];
        
        for (int i = 0; i < num; i++) {
            arrayPersona[i] = new Persona();
            System.out.printf("Persona %d: %s \n",i+1, arrayPersona[i].toString());
        }
       */
        
    }
    
    
    
}

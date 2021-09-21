package dam;

import java.util.Scanner;

public class Ex2 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int dni = 0;
        String letra = " ";
        
        System.out.println("DNI: ...");
        
        dni = Integer.parseInt(teclado.nextLine());
        letra= averiguarLetra(dni);
        
        System.out.printf("El dni completo es: %d - %s",dni,letra);
        
        
    }
    private static String averiguarLetra(int dni){
        String letra =" ";
        int posicion = 0;
        String  opciones [] = {"T","R","W","A","G","M","Y", "F","P","D","X","B","N", "J","Z","S","Q","V","H","L","C","K","E"};

        posicion = dni%23;                 
        letra = opciones[posicion];
        
        return letra; 
    }
    
}

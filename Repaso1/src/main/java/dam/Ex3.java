package dam;

import java.util.Scanner;

public class Ex3 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Altura: ...");
        int altura = Integer.parseInt(teclado.nextLine());
        
        for (int i = 0; i <= altura; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("*");
            }
            System.out.println("");
        }
        
    }
    
}

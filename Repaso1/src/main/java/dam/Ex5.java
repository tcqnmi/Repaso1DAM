package dam;

import java.util.Scanner;

public class Ex5 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Altura: ...");
        int altura = Integer.parseInt(teclado.nextLine());
        
        System.out.println("¿Escalera normal o escalera invertida?  n/i");
        char opcion = teclado.nextLine().trim().toLowerCase().charAt(0);
        
        if(opcion == 'n'){
            for (int i = 1; i <= altura; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.printf("%d",j);
                }
                System.out.println("");
            }
        }else{
            for (int i = 0; i < altura; i++) {
                int num = 1;
                for (int j = altura; j >= i+1; j--) {
                    System.out.printf("%d",num);
                    num++;
                }
                System.out.println("");
            }
        }
        
    }
    
}

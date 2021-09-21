package dam;

import java.util.Random;

public class Ex1 {
     public static void main(String[] args) {
       
        Random rnd = new Random();
    
        int datos [] = new int [15];
        int suma = 0;
        double media = 0;
    
        for (int i = 0; i< datos.length; i++){
            datos[i]= rnd.nextInt(10);
            System.out.printf("Valor nº%d -> %d \n",i+1, datos[i]);
            suma += datos[i];
        }
        
        media = suma/datos.length;  
        
        System.out.printf("La suma del vector es: %d \n",suma);
        System.out.printf("La media del vector es: %.2f",media);
    }
    
}

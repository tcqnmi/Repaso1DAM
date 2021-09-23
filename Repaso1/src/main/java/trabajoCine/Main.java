package trabajoCine;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Título: ...");
        String titulo = teclado.nextLine();
        
        System.out.println("Director: ...");
        String director = teclado.nextLine();
        
        System.out.println("Duración (min): ...");
        int duracion = Integer.parseInt(teclado.nextLine());

        System.out.println("Edad mínima: ...");
        int edadMin = Integer.parseInt(teclado.nextLine());
        
        
        System.out.println("Filas de la sala: ...");
        int i = Integer.parseInt(teclado.nextLine());
        
        System.out.println("Columnas de la sala: ...");
        int j = Integer.parseInt(teclado.nextLine());
        
        
        
        
        
    }
    
}

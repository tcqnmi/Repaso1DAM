package plantas;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in); 

        
        System.out.println("Gen 1 de flor 1: ...");
        String gen1Flor1 = teclado.nextLine();
        
        System.out.println("Gen 2 de flor 1: ...");
        String gen2Flor1 = teclado.nextLine();
        
        
        Planta flor1 = new Planta(gen1Flor1, gen2Flor1);
        
        System.out.println("Flor1 es de color: "+flor1.getFenotipo()); 
        
        System.out.println("Gen 1 de flor 2: ...");
        String gen1Flor2 = teclado.nextLine();
        
        
        System.out.println("Gen 2 de flor 1: ...");
        String gen2Flor2 = teclado.nextLine();
        
        
        
        Planta flor2 = new Planta(gen1Flor2, gen2Flor2);
        
        System.out.println("Flor2 es de color: "+flor2.getFenotipo()); 
        
        Planta flor3 = flor1.reproduirCon(flor2);
        
        System.out.println("Flor3 es de color: "+flor3.getFenotipo());
        System.out.println("El genotipo de flor 3 es: "+flor2.mostrarGenotipo());


        
        
        
    }
    
}

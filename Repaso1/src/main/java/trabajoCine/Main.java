package trabajoCine;

import java.util.Scanner;
import java.util.ArrayList;

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
        
        Pelicula peli = new Pelicula (titulo, director, duracion, edadMin);        
        
        System.out.println("Filas de la sala: ...");
        int i = Integer.parseInt(teclado.nextLine());
        
        System.out.println("Columnas de la sala: ...");
        int j = Integer.parseInt(teclado.nextLine());
        
        System.out.println("Precio de la película: ...");
        double precio = Double.parseDouble(teclado.nextLine()); 
        
        Sala s1 = new Sala(precio, peli);
        s1.generarAsientos(i,j);
        
        System.out.println("Número de espectadores: ...");
        int nEspec = Integer.parseInt(teclado.nextLine());
        
        int cont = 0;
        for (int k = 1; k < nEspec; k++) {
            ArrayList <Espectador> e = new ArrayList<Espectador>();
            if(s1.haySitio()){
                s1.sentar(e.get(k));
            }            
        }     
        
    }
    
}

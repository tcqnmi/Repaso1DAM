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
        System.out.println("\t> Clase Pelicula | Método constructor| Creación de la película");
        
        System.out.println("Filas de la sala: ...");
        int i = Integer.parseInt(teclado.nextLine());
        
        System.out.println("Columnas de la sala: ...");
        int j = Integer.parseInt(teclado.nextLine());
        
        System.out.println("Precio de la película: ...");
        double precio = Double.parseDouble(teclado.nextLine()); 
        
        Sala s1 = new Sala(precio, peli);
        System.out.println("\t> Clase Sala | Método constructor| Creación de la sala");

        s1.generarAsientos(i,j);
        System.out.println("\t> Clase Sala | Método generarAsientos| Crea tantos objetos butaca como hayamos"
                + "indicado por pantalla, les da parámetros de fila(int) y columna(char)");

        
        System.out.println("Número de espectadores: ...");
        int nEspec = Integer.parseInt(teclado.nextLine());
        
        ArrayList <Espectador> espectadores = new ArrayList<Espectador>();
        for (int k = 0; k < nEspec; k++) {
           
            Espectador e = new Espectador();
            espectadores.add(e);
            
            if(!s1.haySitio()){
                
                s1.sentar(espectadores.get(k));
                espectadores.get(k).pagar(precio);
            }else{
                System.out.println("No hay sitio");
            }            
        }
        
        System.out.println("\t> Clase Espectador | Método constructor| Creación de tantos espectadores como "
                + "se indiquen por pantalla");
        System.out.println("\t> Clase Sala | Método haySitio| Comprueba en cada iteracón que"
                + "hay al menos una butaca vacía en la sala");
        System.out.println("\t> Clase Sala | Método sentar| Sienta al espectador en una butaca aleatoria");
        System.out.println("\t> Clase Espectador | Método pagar| Resta el precio"
                + " de la entrada del dinero del espectador");
        
        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                char [] letra = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S'};
                System.out.printf("| %12s |",s1.getAsiento(k, letra[l]).getEspec().getNombre());
                
            }
            System.out.println(" ");
            System.out.println(" ");
        }

        
    }
    
}
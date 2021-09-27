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
        
        Sala sala1 = new Sala(precio, peli);
        System.out.println("\t> Clase Sala | Método constructor| Creación de la sala");

        sala1.generarAsientos(i,j);
        System.out.println("\t> Clase Sala | Método generarAsientos| Crea tantos objetos butaca como hayamos"
                + "indicado por pantalla, les da parámetros de fila(int) y columna(char)");

        
        System.out.println("Número de espectadores: ...");
        int nEspec = Integer.parseInt(teclado.nextLine());
        
        ArrayList <Espectador> espectadores = new ArrayList<Espectador>();
        
        for (int k = 0; k < nEspec; k++) {
           
            Espectador espectador1 = new Espectador();
            espectadores.add(espectador1);
            
            System.out.printf("Vamos a sentar a: %s de %d años y que tiene %.2f€ \n "
                    ,espectador1.getNombre(),espectador1.getEdad(),espectador1.getDinero());
            
            if(sala1.haySitio()){
                
                if(sala1.sePuedeSentar(espectador1)){
                    sala1.sentar(espectadores.get(k));
                }else{
                    System.out.printf(" ---> No puede entrar en la sala \n");
                }
                
            }else{
                System.out.println("No hay sitio");
            }
            System.out.println("");
        }
        
        System.out.println("\t> Clase Espectador | Método constructor| Creación de tantos espectadores como "
                + "se indiquen por pantalla");
        System.out.println("\t> Clase Sala | Método haySitio| Comprueba en cada iteracón que"
                + "hay al menos una butaca vacía en la sala");
        System.out.println("\t> Clase Sala | Método sentar| Sienta al espectador en una butaca aleatoria");
        System.out.println("\t> Clase Espectador | Método pagar| Resta el precio"
                + " de la entrada del dinero del espectador");
        
        System.out.println("");
        System.out.println("------ DISPOSICÓN DE LA SALA ------");
        System.out.println("");
        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                char [] letra = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S'};
                if(sala1.getAsiento(k,letra[l]).ocupado()){
                    System.out.printf("(%d- %c)| %10s |",k,letra[l],sala1.getAsiento(k, letra[l]).getEspec().getNombre());
                }else{
                    System.out.printf("(%d- %c)| %10s |",k,letra[l],"Vacío");
                }
                
            }
            System.out.println(" ");
        }

        
    }
    
}
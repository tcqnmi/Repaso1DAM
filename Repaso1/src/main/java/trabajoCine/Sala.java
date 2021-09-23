
package trabajoCine;

public class Sala {
    
    private int [][] tam= new int[0][0];
    private double precio = 0;
    private Pelicula peli = new Pelicula();

    public Sala(int fil, int col, int precio,Pelicula peli) {
        
        this.tam = new int [fil][col];
        this.precio = precio;
        this.peli= new Pelicula(peli);
        
    }
    
    public void generarAsientos(){
        char [] letra = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S'};
        for (int i = 0; i < tam.length; i++) {
            for (int j = 0; j < tam[i].length; j++) {
                if (j <= letra.length){
                    Espectador e = new Espectador();
                    Butaca b = new Butaca(i,letra[j]);
                }
                
            }
        }
        
    }
    
    
    
    
    
    
    
    
}

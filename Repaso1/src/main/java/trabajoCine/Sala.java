
package trabajoCine;

public class Sala {
    
   
    private double precio = 0;
    private Pelicula peli = new Pelicula();

    public Sala(int fil, int col, int precio,Pelicula peli) {
        
        this.precio = precio;
        this.peli= new Pelicula(peli);
        
    }
    
    public void generarAsientos(int fil, int col){
        char [] letra = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S'};
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
               Butaca [i][j] sala= new Butaca(i,letra[j]);
            }
        }
        
    }
    
    public boolean haySitio(){
       for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[i].length; j++) {
               if (not sala[i][j].ocupado()){
                 return true;
               
            }
        }
    }
    
    
    
    
    
    
    
    
}

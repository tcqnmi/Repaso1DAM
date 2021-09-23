
package trabajoCine;

import java.util.ArrayList;

public class Sala {
    
    private ArrayList<Butaca> asientos = new ArrayList<Butaca>();
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
                Butaca asiento = new Butaca(i,letra[j]);
                asientos.add(asiento);
            }
        }
        
    }
    
    public boolean haySitio(){
       for (int i = 0; i < asientos.size(); i++) {
            if(asientos.get(i).ocupado()){
                //Continua sin realizar nada
            } else {
                return true;  
            }
            
        }
        return false;
    }
    
    public boolean haySitioEnButaca(int fila,char letra){
        
        for (int i = 0; i < asientos.size(); i++) {
            if(asientos.get(i).getFila() == fila && asientos.get(i).getColumna()== letra){
                return !asientos.get(i).ocupado();
            }
        }
        return false;
    }
    
    public boolean sePuedeSentar(Espectador e){
    
        if(haySitio() && e.getEdad()>=peli.getEdadMin() && e.tieneDinero(this.precio)){
            
            return true;
        
        }
        
        return true;
    }
    
    
}

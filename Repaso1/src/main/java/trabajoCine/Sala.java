
package trabajoCine;

import java.util.ArrayList;
import java.util.Random;

public class Sala {
    
    private ArrayList<Butaca> asientos = new ArrayList<Butaca>();
    private double precio = 0;
    private Pelicula peli = new Pelicula();

    public Sala(double precio,Pelicula peli) {
        
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
       boolean sw = false;
       for (int i = 0; i < asientos.size(); i++) {
            if(asientos.get(i).ocupado()){
                //Continua sin realizar nada
            } else {
                sw = true;  
            }
            
        }
        return sw;
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
    
        return haySitio() && e.tieneEdad(peli.getEdadMin()) && e.tieneDinero(this.precio);
    }
    
    public void sentar(Espectador e){
        
        Random rnd = new Random();
        int pos = rnd.nextInt(asientos.size());
       asientos.get(pos).setEspec(e);          
    }
    
    public Butaca getAsiento(int fila, char col){
        
        int posicion = 0;
        for (int i = 0; i < asientos.size(); i++) {
            if(asientos.get(i).getFila() == fila && asientos.get(i).getColumna()== col){
                posicion = i;
               
            }
        }
        return asientos.get(posicion);
    } 

    
    
    
}
package exHerencia;

public class Helicoptero extends Vehiculo {
    
    private int tamanoHelice; 
    private boolean enElAire = false;

    public Helicoptero(int tamanoHelice, String nombre, String color, int velocidadMax) {
        super(nombre, color, velocidadMax);
        this.tamanoHelice = tamanoHelice;
    }
    
    public void despegar(){
        if(!this.enElAire){
            System.out.println(this.getNombre()+" despega");
            enElAire = true;
        }else{
            System.out.println(this.getNombre()+" ya está en el aire");
        }        
    }
    
    public void aterrizar(){
        if(this.enElAire){
            System.out.println(this.getNombre()+" aterriza");
            enElAire = false;
        }else{
             System.out.println(this.getNombre()+" ya está en el suelo");
        }
    }
    
    @Override
    public void arrancar(){
        System.out.println(this.getNombre()+" arranca el hélice");
    }

    public int getTamanoHelice() {
        return tamanoHelice;
    }

    public void setTamanoHelice(int tamanoHelice) {
        this.tamanoHelice = tamanoHelice;
    }

    public boolean isEnElAire() {
        return enElAire;
    }

    public void setEnElAire(boolean enElAire) {
        this.enElAire = enElAire;
    }
    
    
    
}

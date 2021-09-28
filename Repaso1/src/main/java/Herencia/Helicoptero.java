package Herencia;

public class Helicoptero extends Vehiculo {
    
    private int tamanoHelice; 
    private boolean enElAire = false;

    public Helicoptero(int tamanoHelice, String nombre, String color, int velocidadMax) {
        super(nombre, color, velocidadMax);
        this.tamanoHelice = tamanoHelice;
    }
    
    public void despegar(){
        System.out.println(super.getNombre()+" despega");
        enElAire = true;
        System.out.printf(" %s",enElAire?"Volando":"enTierra");
        
    }
    
    public void aterrizar(){
        System.out.println(super.getNombre()+" aterriza");
        enElAire = false;
        System.out.printf(" %s",enElAire?"Volando":"enTierra");

    }
    
    @Override
    public void arrancar(){
        System.out.println(super.getNombre()+" arranca el hélice");
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

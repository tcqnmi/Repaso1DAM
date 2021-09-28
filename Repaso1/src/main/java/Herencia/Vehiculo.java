
package Herencia;


public class Vehiculo {
    
    private String nombre;
    private String color;
    private int velocidadMax;

    public Vehiculo(String nombre, String color, int velocidadMax) {
        this.nombre = nombre;
        this.color = color;
        this.velocidadMax = velocidadMax;
    }
    
    public void pitar(){

        System.out.println(this.nombre+" está pitando ");
    }  
    
    public void arrancar(){
        System.out.println(this.nombre+" ha arrancado");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }
    
    
}





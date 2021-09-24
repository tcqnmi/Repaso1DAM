
package trabajoCine;

import java.util.Random;

public class Espectador {
    
    private String nombre = "no asignado";
    private int edad = 0;
    private float dinero = 0;

    
    
    public Espectador(String nombre) {
    
    }
    
    public Espectador(){
        Random rnd = new Random();
        String[] nombres = { "Andrea", "David", "Baldomero", "Balduino", "Baldwin", "Baltasar", "Barry", "Bartolo",
				"Bartolomé", "Baruc", "Baruj", "Candelaria", "Cándida", "Canela", "Caridad", "Carina", "Carisa",
				"Caritina", "Carlota", "Baltazar","Juan", "José", "Miguel","Antonio"};
        int num = rnd.nextInt(24);
        this.nombre = nombres[num];
        this.edad = rnd.nextInt(90);
        this.dinero = rnd.nextFloat()*100;

                          
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        
       this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getDinero() {
        return dinero;
    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }
    
    public boolean tieneEdad(int edad){
        return this.edad>=edad;
    }
    
    public boolean tieneDinero(double cantidad){
        return this.dinero>=dinero;
    }
    
    public void pagar (double cantidad) {
        if(tieneDinero(cantidad))
            this.dinero -= cantidad;
       
    }
    
    
}
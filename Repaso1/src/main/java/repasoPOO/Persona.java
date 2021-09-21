
package repasoPOO;

import java.util.Random;

public class Persona {
    
    Random rnd = new Random();
    Dni nuevo = new Dni();
    
    private int edad = 0;
    private float peso = 0;
    private float altura = 0;
    private String dni = " "; 
    
    public Persona(){
        this.edad = rnd.nextInt(41);
        this.peso = rnd.nextFloat()+rnd.nextInt(50)+40;
        this.altura = ((rnd.nextInt(250))+50)/100;
        this.dni= nuevo.generarDni();
    }
    
    public Persona(int edad, float peso, float altura, String dni){
       
    }

    public Dni getNuevo() {
        return nuevo;
    }


    public int getEdad() {
        return edad;
    }
    
    public float getPeso() {
        return peso;
    }


    public float getAltura() {
        return altura;
    }

 
    public String getDni() {
        return dni;
    }

    
    public double getIMC(){
        
        double imc = this.peso/Math.pow(this.altura,2);
        
        return imc;
    }
    
    public boolean esMayorDeEdad(){
        
        return this.edad>=18;
    }

    @Override
    public  String toString() {
        return String.format("Edad %d , peso: %.2f , altura: %.2f , dni:  %s" ,edad, peso, altura, dni );
    }
   
    
    
}

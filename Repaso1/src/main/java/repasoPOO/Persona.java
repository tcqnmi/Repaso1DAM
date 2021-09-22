
package repasoPOO;

import java.util.Random;

public class Persona {
    /*No dejo los objetos a los que llamaré en los atributos si no allí donde los voy a necesitar
    inicializandolos como variables locales del método
    Random rnd = new Random();
    Dni nuevo = new Dni(); */
    
    /*En atributos añadimos siempre la mínima información posible y esencial*/
    
    private int edad = 0;
    private float peso = 0;
    private double altura = 0;
    private String dni = " "; 
    
    public Persona(){
        
        Random rnd = new Random();
        Dni nuevo = new Dni();
        
        this.edad = rnd.nextInt(41);
        this.peso = rnd.nextFloat()*(90-40)+40;
        this.altura = rnd.nextDouble()*(3 - 0.5)+0.5; //multiplicacndo por el max sabemos que no saldrá por encima del máx
                                                   //si le restamos el mínimo estaríamos acotando que no se pase el max
                                                   //al sumarle el minimo de inicio
        nuevo.generar();
        this.dni= nuevo.getDni();
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public float getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public String getDni() {
        return dni;
    }
  
    public double getIMC(){
        
        return this.peso/Math.pow(this.altura,2);
    }
    
    public boolean esMayorDeEdad(){
        
        return this.edad>=18;
    }
    /** Evitamos que los objetos muestren por pantalla o reciban por teclado información, eso debería hacerlo solamente el MAIN
    @Override
    public  String toString() {
        return String.format("Edad %2d, peso: %4.2f, altura: %4.2f, dni: %9s, Mayor de edad: %s, IMC: %.2f" ,edad, peso, altura, dni, esMayorDeEdad() ? "Si" : "No", getIMC()  );
    }*/
   
    
    
}

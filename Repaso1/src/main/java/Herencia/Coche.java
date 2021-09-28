
package Herencia;


public class Coche extends Vehiculo {
    
    private String matricula;
    private int nPuertas;

    public Coche(String matricula, int nPuertas, String nombre, String color, int velocidadMax) {
        super(nombre, color, velocidadMax);
        this.matricula = matricula;
        this.nPuertas = nPuertas;
    }
    
    public void abrirPuertas(){
        System.out.println(this.getNombre()+" abre sus puertas");
    }
    
    @Override
    public void arrancar(){
        System.out.println(this.getNombre()+" arranca el motor del coche");
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getnPuertas() {
        return nPuertas;
    }

    public void setnPuertas(int nPuertas) {
        this.nPuertas = nPuertas;
    }
    
    
    
    
}

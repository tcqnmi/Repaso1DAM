package exHerencia;

public class Moto extends Vehiculo{
    
    private String matricula;

    public Moto(String matricula, String nombre, String color, int velocidadMax) {
        super(nombre, color, velocidadMax);
        this.matricula = matricula;
    }
    
    public void hacerCaballito(){
        System.out.println(this.getNombre()+" hace un caballito");
    }
    
    
    @Override
    public void arrancar(){
        System.out.println(this.getNombre()+" arranca el motor de la moto");
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
    
            
}

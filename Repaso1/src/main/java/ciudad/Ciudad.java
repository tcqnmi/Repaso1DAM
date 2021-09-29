package ciudad;

import java.util.ArrayList;

public class Ciudad {
    
    private String nombre;
    private ArrayList <Casa> viviendas = new ArrayList <Casa>();

    public Ciudad(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Casa> getViviendas() {
        return viviendas;
    }

    public void setViviendas(ArrayList<Casa> viviendas) {
        this.viviendas = viviendas;
    }
    
    public void añadirVivienda(Casa c1){
        viviendas.add(c1);
    }
    
    public int numeroDeHabitantes(){
    
        int habitantes =0 ;
        
        for (int i = 0; i < viviendas.size(); i++) {
            habitantes += viviendas.get(i).getOcupantes().size();
        }
       
        return habitantes;    
    }
    
    public void mostrarPoblacion(){
        
        System.out.println("Habitantes: ");
        for (int i = 0; i < viviendas.size(); i++) {
            viviendas.get(i).mostrarOcupantes();
            System.out.println(" ");
        }
    }
    
}

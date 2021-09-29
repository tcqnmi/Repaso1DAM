package ciudad;

import java.util.ArrayList;
public class Casa {
    
    private int extesion;
    private ArrayList <Persona> ocupantes = new ArrayList <Persona>(); 

    public Casa(int extesion) {
        this.extesion = extesion;
    }

    public int getExtesion() {
        return extesion;
    }

    public void setExtesion(int extesion) {
        this.extesion = extesion;
    }

    public ArrayList<Persona> getOcupantes() {
        return ocupantes;
    }

    public void setOcupantes(ArrayList<Persona> ocupantes) {
        this.ocupantes = ocupantes;
    }
       
    public boolean meterPersonas(Persona p1){
        if(extesion>ocupantes.size()){
            ocupantes.add(p1);
            return true;
        }else{
            return false;
        }
    }
    
    public void mostrarOcupantes(){
        
        System.out.printf("Habitantes de la casa: ");
        for (int i = 0; i < ocupantes.size(); i++) {
            System.out.printf(" %s ",ocupantes.get(i).getNombre());
            
        }
    }
    
}



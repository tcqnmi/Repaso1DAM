package plantas;

public class Planta {
    
    private String gen1;
    private String gen2;

    public Planta(String gen1, String gen2) {
        this.gen1 = gen1;
        this.gen2 = gen2;
    }
        
    public String getFenotipo(){
        
        if(this.gen1.equals("rojo")){
            switch(this.gen2.toLowerCase()){
                    case "rojo":
                        return "Rojo";
                    
                    case "blanco":
                        return "Rosa";
                        
                    case "amarillo":
                        return "Naranja";
                     
                    case "negro":
                        return "Rojo";
                     
                    case "azul":
                        return "Morado";                      
            }
        }else if(this.gen1.equals("blanco")){
            switch(this.gen2.toLowerCase()){
                    case "rojo":
                        return "Rosa";
                    
                    case "blanco":
                        return "Blanco";
                        
                    case "amarillo":
                        return "Blanco";
                     
                    case "negro":
                        return "Blanco";
                     
                    case "azul":
                        return "Blanco";                      
            }
        }else if(this.gen1.equalsIgnoreCase("amarillo")){
            switch(this.gen2.toLowerCase()){
                    case "rojo":
                        return "Naranja";
                    
                    case "blanco":
                        return "Blanco";
                        
                    case "amarillo":
                        return "Amarillo";
                     
                    case "negro":
                        return "Negro";
                     
                    case "azul":
                        return "Azul";                      
            }
        }else if(this.gen1.equalsIgnoreCase("negro")){
            switch(this.gen2.toLowerCase()){
                    case "rojo":
                        return "Rojo";
                    
                    case "blanco":
                        return "Blanco";
                        
                    case "amarillo":
                        return "Negro";
                     
                    case "negro":
                        return "Verde";
                     
                    case "azul":
                        return "Azul";                      
            }
        }else if(this.gen1.equalsIgnoreCase("azul")){
            switch(this.gen2.toLowerCase()){
                    case "rojo":
                        return "Morado";
                    
                    case "blanco":
                        return "Blanco";
                        
                    case "amarillo":
                        return "Azul";
                     
                    case "negro":
                        return "Azul";
                     
                    case "azul":
                        return "Azul";                      
            }
        }  
        return "Color no existente";
    }
    
    public String mostrarGenotipo(){
    
        return String.format("El gen1: %s y el gen2: %s ",this.gen1, this.gen2);
    }
    
    public Planta reproduirCon(Planta planta2){
        Planta plantaHija = new Planta (this.gen1, planta2.gen2);
        return plantaHija;
    }
    
}

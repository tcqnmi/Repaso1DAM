package trabajoCine;

public class Pelicula {
    
    private String titulo = "No asignado";
    private String director = "No asignado";
    private int duracion = 0;
    private int edadMin = 0;

    public Pelicula(String titulo, String director, int duracion, int edadMin) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.edadMin = edadMin;
    }

    public Pelicula(Pelicula p1) {
        this.titulo = p1.getTitulo();
        this.director = p1.getDirector();
        this.duracion = p1.getDuracion();
        this.edadMin = p1.getEdadMin();
        
    }
    
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(int edadMin) {
        this.edadMin = edadMin;
    }
    
    
    
    
    
}

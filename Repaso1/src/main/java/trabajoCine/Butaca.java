
package trabajoCine;

public class Butaca {
    
    private int fila = 0;
    private char columna = ' ';
    private Espectador espec = new Espectador();

    public Butaca(int fila, char col) {
        this.fila = fila;
        this.columna = col;   
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public char getColumna() {
        return columna;
    }

    public void setColumna(char columna) {
        this.columna = columna;
    }

    public Espectador getEspec() {
        return espec;
    }

    public void setEspec(Espectador espec) {
        this.espec = espec;
    }
    
    
    
}

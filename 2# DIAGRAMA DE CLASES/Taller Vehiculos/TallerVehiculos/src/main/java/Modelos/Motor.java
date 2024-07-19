package Modelos;
 
public class Motor {
    private String id;
    private double peso;
    private int caballosDeFuerza;

    public Motor() {
    }

    public Motor(String id, double peso, int caballosDeFuerza) {
        this.id = id;
        this.peso = peso;
        this.caballosDeFuerza = caballosDeFuerza;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the caballosDeFuerza
     */
    public int getCaballosDeFuerza() {
        return caballosDeFuerza;
    }

    /**
     * @param caballosDeFuerza the caballosDeFuerza to set
     */
    public void setCaballosDeFuerza(int caballosDeFuerza) {
        this.caballosDeFuerza = caballosDeFuerza;
    }
    
    
}

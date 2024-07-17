
package Modelos;

public class Empresa {
    private String id;
    private String nombre;
    private double valorBolsa;
    
    private Jugador jugador;

    public Empresa() {
    }

    public Empresa(String id, String nombre, double valorBolsa) {
        this.id = id;
        this.nombre = nombre;
        this.valorBolsa = valorBolsa;
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
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the valorBolsa
     */
    public double getValorBolsa() {
        return valorBolsa;
    }

    /**
     * @param valorBolsa the valorBolsa to set
     */
    public void setValorBolsa(double valorBolsa) {
        this.valorBolsa = valorBolsa;
    }
    
}

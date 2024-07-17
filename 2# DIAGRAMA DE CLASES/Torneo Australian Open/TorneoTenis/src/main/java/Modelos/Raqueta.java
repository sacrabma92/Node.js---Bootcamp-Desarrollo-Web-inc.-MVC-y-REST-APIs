package Modelos;

public class Raqueta {
    private String id;
    private String marca;
    private Double peso;

    public Raqueta() {
    }

    public Raqueta(String id, String marca, Double peso) {
        this.id = id;
        this.marca = marca;
        this.peso = peso;
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
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the peso
     */
    public Double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    
}

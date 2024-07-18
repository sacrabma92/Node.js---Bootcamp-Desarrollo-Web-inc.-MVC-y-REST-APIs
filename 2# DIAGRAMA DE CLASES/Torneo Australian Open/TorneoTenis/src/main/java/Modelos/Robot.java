package Modelos;

public class Robot {
    private String id;
    private String marca;
    private String voltaje;
    
    private Camara camara;

    public Robot() {
    }

    public Robot(String id, String marca, String voltaje) {
        this.id = id;
        this.marca = marca;
        this.voltaje = voltaje;
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
     * @return the voltaje
     */
    public String getVoltaje() {
        return voltaje;
    }

    /**
     * @param voltaje the voltaje to set
     */
    public void setVoltaje(String voltaje) {
        this.voltaje = voltaje;
    }

    /**
     * @return the camara
     */
    public Camara getCamara() {
        return camara;
    }

    /**
     * @param camara the camara to set
     */
    public void setCamara(Camara camara) {
        this.camara = camara;
    }
    
}

package Modelos;

public class Vehiculo {
    private String id;
    private String marca;
    private String anio;
    private String color;
    private double avaluo;
    
    private Motor miMotor;

    public Vehiculo() {
    }

    public Vehiculo(String id, String marca, String anio, String color, double avaluo) {
        this.id = id;
        this.marca = marca;
        this.anio = anio;
        this.color = color;
        this.avaluo = avaluo;
    }
    
    public void crearMotor(String id, double peso, int caballosFuerza){
        this.miMotor = new Motor(id, peso, caballosFuerza);
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
     * @return the anio
     */
    public String getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(String anio) {
        this.anio = anio;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    public double getAvaluo(){
        return avaluo;
    }

    /**
     * @param avaluo the avaluo to set
     */
    public void setAvaluo(double avaluo) {
        this.avaluo = avaluo;
    }

    /**
     * @return the miMotor
     */
    public Motor getMiMotor() {
        return miMotor;
    }

    /**
     * @param miMotor the miMotor to set
     */
    public void setMiMotor(Motor miMotor) {
        this.miMotor = miMotor;
    }

}

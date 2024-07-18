
package Modelos;

import java.util.LinkedList;

public class Jugador {
    private String id;
    private String nombre;
    private String nacionalidad;
    private int posicionRanking;
    private int edad;
    private int puntoTorneo; 
    
    private Raqueta raqueta;
    
    private LinkedList<Partido> partido;
    
    private LinkedList<Empresa> empresa;

    public Jugador() {
    }

    public Jugador(String id, String nombre, String nacionalidad, int posicionRanking, int edad, int puntoTorneo) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.posicionRanking = posicionRanking;
        this.edad = edad;
        this.puntoTorneo = puntoTorneo;
    }
    
    public void describirRaqueta(){
        System.out.println("El jugador: " + this.getNombre());
        System.out.println("Marca Raqueta: "+ this.getRaqueta().getMarca());
        System.out.println("Peso: " + this.getRaqueta().getPeso());
    }
    
    public void describirJugador(){
        System.out.println("El jugador "+this.getNombre()+" es del pais "+this.getNacionalidad()+
                " y tiene "+this.getEdad()+" años y tiene "+this.getPuntoTorneo());
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
     * @return the nacionalidad
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * @param nacionalidad the nacionalidad to set
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     * @return the posicionRanking
     */
    public int getPosicionRanking() {
        return posicionRanking;
    }

    /**
     * @param posicionRanking the posicionRanking to set
     */
    public void setPosicionRanking(int posicionRanking) {
        this.posicionRanking = posicionRanking;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the puntoTorneo
     */
    public int getPuntoTorneo() {
        return puntoTorneo;
    }

    /**
     * @param puntoTorneo the puntoTorneo to set
     */
    public void setPuntoTorneo(int puntoTorneo) {
        this.puntoTorneo = puntoTorneo;
    }

    /**
     * @return the raqueta
     */
    public Raqueta getRaqueta() {
        return raqueta;
    }

    /**
     * @param raqueta the raqueta to set
     */
    public void setRaqueta(Raqueta raqueta) {
        this.raqueta = raqueta;
    }

    /**
     * @return the partido
     */
    public LinkedList<Partido> getPartido() {
        return partido;
    }

    /**
     * @param partido the partido to set
     */
    public void setPartido(LinkedList<Partido> partido) {
        this.partido = partido;
    }

    /**
     * @return the empresa
     */
    public LinkedList<Empresa> getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(LinkedList<Empresa> empresa) {
        this.empresa = empresa;
    }
     
}

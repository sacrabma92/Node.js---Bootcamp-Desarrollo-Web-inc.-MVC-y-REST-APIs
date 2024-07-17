package Modelos;

import java.util.LinkedList;

public class Torneo {
    private String id;
    private String nombre;
    
    private LinkedList<Jugador> jugador;
    
    private LinkedList<Empresa> empresa;

    public Torneo() {
    }

    public Torneo(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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
     * @return the jugador
     */
    public LinkedList<Jugador> getJugador() {
        return jugador;
    }

    /**
     * @param jugador the jugador to set
     */
    public void setJugador(LinkedList<Jugador> jugador) {
        this.jugador = jugador;
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

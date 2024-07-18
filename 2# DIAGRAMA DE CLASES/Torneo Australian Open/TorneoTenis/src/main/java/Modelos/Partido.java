
package Modelos;

import java.util.Date;

public class Partido {
    private String id;
    private Date echa;
    
    private Jugador jugador;
    private Cancha cancha;

    public Partido() {
    }

    public Partido(String id, Date echa) {
        this.id = id;
        this.echa = echa;
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
     * @return the echa
     */
    public Date getEcha() {
        return echa;
    }

    /**
     * @param echa the echa to set
     */
    public void setEcha(Date echa) {
        this.echa = echa;
    }

    /**
     * @return the jugador
     */
    public Jugador getJugador() {
        return jugador;
    }

    /**
     * @param jugador the jugador to set
     */
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    /**
     * @return the cancha
     */
    public Cancha getCancha() {
        return cancha;
    }

    /**
     * @param cancha the cancha to set
     */
    public void setCancha(Cancha cancha) {
        this.cancha = cancha;
    }
    
    
}

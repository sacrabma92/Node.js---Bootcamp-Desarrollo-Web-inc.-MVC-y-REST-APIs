package Modelos;

import java.util.LinkedList;

public class Cancha {
    private String id;
    private String nombre;
    
    private LinkedList<Partido> partido;
    
    private LinkedList<Robot> robot;

    public Cancha() {
    }

    public Cancha(String id, String nombre) {
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
     * @return the robot
     */
    public LinkedList<Robot> getRobot() {
        return robot;
    }

    /**
     * @param robot the robot to set
     */
    public void setRobot(LinkedList<Robot> robot) {
        this.robot = robot;
    }
    
}

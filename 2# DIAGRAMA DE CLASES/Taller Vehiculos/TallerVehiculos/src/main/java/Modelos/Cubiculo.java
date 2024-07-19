package Modelos;

import java.util.LinkedList;

public class Cubiculo {
    private String id;
    
    private KitHerramientas misHerramientas;
    
    private LinkedList<Vehiculo> miVehiculo;

    public Cubiculo() {
    }

    public Cubiculo(String id) {
        this.id = id;
        this.miVehiculo = new LinkedList<>();
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
     * @return the miVehiculo
     */
    public LinkedList<Vehiculo> getMiVehiculo() {
        return miVehiculo;
    }

    /**
     * @param miVehiculo the miVehiculo to set
     */
    public void setMiVehiculo(LinkedList<Vehiculo> miVehiculo) {
        this.miVehiculo = miVehiculo;
    }

    /**
     * @return the misHerramientas
     */
    public KitHerramientas getMisHerramientas() {
        return misHerramientas;
    }

    /**
     * @param misHerramientas the misHerramientas to set
     */
    public void setMisHerramientas(KitHerramientas misHerramientas) {
        this.misHerramientas = misHerramientas;
    }
    
}

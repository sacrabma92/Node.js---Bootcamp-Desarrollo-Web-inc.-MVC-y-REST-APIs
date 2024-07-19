package Modelos;

import java.util.LinkedList;

public class Taller {
    private String nombre;
    private String direccion;
    
    private LinkedList<Cubiculo> misCubiculos;
    
    private LinkedList<Tecnico> misTecnicos;

    public Taller() {
    }

    public Taller(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.misCubiculos = new LinkedList<>();
        this.misTecnicos = new LinkedList<>();
    }
    
    public void crearCubiculo(String id){
        Cubiculo nuevoCubiculo = new Cubiculo(id);
        this.misCubiculos.add(nuevoCubiculo);
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
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the misCubiculos
     */
    public LinkedList<Cubiculo> getMisCubiculos() {
        return misCubiculos;
    }

    /**
     * @param misCubiculos the misCubiculos to set
     */
    public void setMisCubiculos(LinkedList<Cubiculo> misCubiculos) {
        this.misCubiculos = misCubiculos;
    }

    /**
     * @return the misTecnicos
     */
    public LinkedList<Tecnico> getMisTecnicos() {
        return misTecnicos;
    }

    /**
     * @param misTecnicos the misTecnicos to set
     */
    public void setMisTecnicos(LinkedList<Tecnico> misTecnicos) {
        this.misTecnicos = misTecnicos;
    }
    
}


package Modelos;

public class Camara {
    private String id;
    private String marca;
    private String referencia;
    private String resolucion;
    private int numeroFotografias;

    public Camara() {
    }

    public Camara(String id, String marca, String referencia, String resolucion, int numeroFotografias) {
        this.id = id;
        this.marca = marca;
        this.referencia = referencia;
        this.resolucion = resolucion;
        this.numeroFotografias = numeroFotografias;
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
     * @return the referencia
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * @param referencia the referencia to set
     */
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    /**
     * @return the resolucion
     */
    public String getResolucion() {
        return resolucion;
    }

    /**
     * @param resolucion the resolucion to set
     */
    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    /**
     * @return the numeroFotografias
     */
    public int getNumeroFotografias() {
        return numeroFotografias;
    }

    /**
     * @param numeroFotografias the numeroFotografias to set
     */
    public void setNumeroFotografias(int numeroFotografias) {
        this.numeroFotografias = numeroFotografias;
    }
    
}

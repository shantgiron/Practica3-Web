package model;

import java.io.Serializable;

public class Etiqueta implements Serializable {

    private Long id;
    private String etiqueta;

    public Etiqueta() {
    }

    public Etiqueta(Long id, String etiqueta, Articulo articulo) {
        this.id = id;
        this.etiqueta = etiqueta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    @Override
    public String toString() {
        return "Etiqueta{" +
                "id=" + id +
                ", etiqueta='" + etiqueta + '\'' +
                '}';
    }
}











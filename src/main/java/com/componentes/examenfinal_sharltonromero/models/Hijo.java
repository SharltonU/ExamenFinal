package com.componentes.examenfinal_sharltonromero.models;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Hijo {

    @Id
    private String nombre;
    private String plan;
    private String alergias;
    private String padre;
    private String madre;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Libro> leidos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getPadre() {
        return padre;
    }

    public void setPadre(String padre) {
        this.padre = padre;
    }

    public String getMadre() {
        return madre;
    }

    public void setMadre(String madre) {
        this.madre = madre;
    }

    public List<Libro> getLeidos() {
        return leidos;
    }

    public void setLeidos(List<Libro> leidos) {
        this.leidos = leidos;
    }
}

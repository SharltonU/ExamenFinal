package com.componentes.examenfinal_sharltonromero.models;

import javax.persistence.*;

@Entity
public class Encargado {
    @Id
    @Basic(optional = false)
    @Column(unique=true, nullable = false)
    private String cedula;
    private String nombre;
    private String direccion;
    private int telefonoPri;
    private int telefonoSec;

    public String getCedula() {
        return cedula;
    }


    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefonoPri() {
        return telefonoPri;
    }

    public void setTelefonoPri(int telefonoPri) {
        this.telefonoPri = telefonoPri;
    }

    public int getTelefonoSec() {
        return telefonoSec;
    }

    public void setTelefonoSec(int telefonoSec) {
        this.telefonoSec = telefonoSec;
    }
}

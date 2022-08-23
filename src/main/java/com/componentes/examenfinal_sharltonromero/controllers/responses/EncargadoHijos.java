package com.componentes.examenfinal_sharltonromero.controllers.responses;

import com.componentes.examenfinal_sharltonromero.models.Encargado;
import com.componentes.examenfinal_sharltonromero.models.Hijo;

import java.util.List;

public class EncargadoHijos {
    private Encargado info;
    private List<Hijo> hijos;

    public Encargado getInfo() {
        return info;
    }

    public void setInfo(Encargado info) {
        this.info = info;
    }

    public List<Hijo> getHijos() {
        return hijos;
    }

    public void setHijos(List<Hijo> hijos) {
        this.hijos = hijos;
    }
}

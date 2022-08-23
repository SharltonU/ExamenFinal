package com.componentes.examenfinal_sharltonromero.services;

import com.componentes.examenfinal_sharltonromero.models.Hijo;

import java.util.List;
import java.util.Optional;

public interface IHijoService {
    void crear(Hijo hijo);
    void actualizar(Hijo hijo);
    Optional<Hijo> buscar(String nombre);
    List<Hijo> buscarPorNombreOApellido(String nombre);
    List<Hijo> buscarPorEncargados(String cedula);
    public List<Hijo> Todos();
}

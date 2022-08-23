package com.componentes.examenfinal_sharltonromero.services;

import com.componentes.examenfinal_sharltonromero.models.Encargado;

import java.util.List;
import java.util.Optional;

public interface IEncargadoService {
    void crear(Encargado encargado);
    void actualizar(Encargado encargado);
    Optional<Encargado> buscar(String cedula);
    List<Encargado> buscarPorNombreOApellido(String nombre);
    public List<Encargado> Todos();
}

package com.componentes.examenfinal_sharltonromero.services;

import com.componentes.examenfinal_sharltonromero.models.Libro;

import java.util.List;
import java.util.Optional;

public interface ILibroService {

    void crear(Libro libro);
    void actualizar(Libro libro);
    List<Libro> buscarPorNombre(String nombre);
    public List<Libro> Todos();
    void borrar(long id);
}

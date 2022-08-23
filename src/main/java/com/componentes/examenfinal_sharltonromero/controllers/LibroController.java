package com.componentes.examenfinal_sharltonromero.controllers;

import com.componentes.examenfinal_sharltonromero.models.Libro;
import com.componentes.examenfinal_sharltonromero.services.ILibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class LibroController {
    @Autowired
    ILibroService libroService;

    @SchemaMapping(typeName = "Query", value = "todosLibros")
    public List<Libro>buscarTodos(){
        return libroService.Todos();
    }
}

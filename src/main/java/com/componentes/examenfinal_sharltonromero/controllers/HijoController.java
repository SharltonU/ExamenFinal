package com.componentes.examenfinal_sharltonromero.controllers;

import com.componentes.examenfinal_sharltonromero.models.Encargado;
import com.componentes.examenfinal_sharltonromero.models.Hijo;
import com.componentes.examenfinal_sharltonromero.services.IHijoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("hijo")
public class HijoController {

    @Autowired
    IHijoService hijoService;

    @PostMapping("/crear")
    public ResponseEntity<Hijo> crear(@RequestBody Hijo hijo){
        hijoService.crear(hijo);
        return new ResponseEntity<>(hijo, HttpStatus.CREATED);
    }

    @PutMapping("/actualizar")
    public String actualizar(@RequestBody Hijo hijo){
        hijoService.actualizar(hijo);
        return "true";
    }

    @GetMapping("/buscar/{nombre}")
    public Optional<Hijo> buscar(@PathVariable String nombre){
        return hijoService.buscar(nombre);
    }

    @GetMapping("/buscarNombre/{nombre}")
    public List<Hijo> buscarNombre(@PathVariable String nombre){
        return hijoService.buscarPorNombreOApellido(nombre);
    }

    @GetMapping("/todos")
    public List<Hijo> todos(){
        return hijoService.Todos();
    }
}

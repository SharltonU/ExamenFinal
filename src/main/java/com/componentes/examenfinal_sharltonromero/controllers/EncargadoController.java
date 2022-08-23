package com.componentes.examenfinal_sharltonromero.controllers;

import com.componentes.examenfinal_sharltonromero.controllers.responses.EncargadoHijos;
import com.componentes.examenfinal_sharltonromero.models.Encargado;
import com.componentes.examenfinal_sharltonromero.services.IEncargadoService;
import com.componentes.examenfinal_sharltonromero.services.IHijoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("encargado")
public class EncargadoController {
    @Autowired
    IEncargadoService encargadoService;
    @Autowired
    IHijoService hijoService;


    @PostMapping("/crear")
    public ResponseEntity<Encargado> crear(@RequestBody Encargado encargado){
        encargadoService.crear(encargado);
        return new ResponseEntity<>(encargado, HttpStatus.CREATED);
    }

    @PutMapping("/actualizar")
    public String actualizar(@RequestBody Encargado encargado){
        encargadoService.actualizar(encargado);
        return "true";
    }

    @GetMapping("/buscar/{cedula}")
    public Optional<Encargado> buscar(@PathVariable String cedula){
        return encargadoService.buscar(cedula);
    }

    @GetMapping("/buscarHijos/{cedula}")
    public ResponseEntity<Object> buscarHijos(@PathVariable String cedula){
        EncargadoHijos EH = new EncargadoHijos();
        EH.setInfo(encargadoService.buscar(cedula).get());
        EH.setHijos(hijoService.buscarPorEncargados(cedula));
        return new ResponseEntity<>(EH, HttpStatus.OK);
    }

    @GetMapping("/buscarNombre/{nombre}")
    public List<Encargado> buscarNombre(@PathVariable String nombre){
        return encargadoService.buscarPorNombreOApellido(nombre);
    }

    @GetMapping("/todos")
    public List<Encargado> todos(){
        return encargadoService.Todos();
    }
}

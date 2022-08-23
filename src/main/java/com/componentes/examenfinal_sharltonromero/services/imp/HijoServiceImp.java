package com.componentes.examenfinal_sharltonromero.services.imp;

import com.componentes.examenfinal_sharltonromero.models.Encargado;
import com.componentes.examenfinal_sharltonromero.models.Hijo;
import com.componentes.examenfinal_sharltonromero.repositories.HijoRepository;
import com.componentes.examenfinal_sharltonromero.services.IHijoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HijoServiceImp implements IHijoService {

    @Autowired
    HijoRepository repository;

    @Override
    public void crear(Hijo hijo) {
        repository.save(hijo);
    }

    @Override
    public void actualizar(Hijo hijo) {
        Optional<Hijo> optHijo = repository.findById(hijo.getNombre());
        if(!optHijo.isPresent()) return;
        Hijo actHijo = optHijo.get();
        BeanUtils.copyProperties(hijo, actHijo);
        repository.save(actHijo);
    }

    @Override
    public Optional<Hijo> buscar(String nombre) {
        return repository.findById(nombre);
    }

    @Override
    public List<Hijo> buscarPorNombreOApellido(String nombre) {
        return repository.findByNombreContainingIgnoreCase(nombre);
    }

    @Override
    public List<Hijo> buscarPorEncargados(String cedula) {
        return repository.findByPadreOrMadre(cedula, cedula);
    }

    @Override
    public List<Hijo> Todos() {
        return repository.findAll();
    }
}

package com.componentes.examenfinal_sharltonromero.services.imp;

import com.componentes.examenfinal_sharltonromero.models.Encargado;
import com.componentes.examenfinal_sharltonromero.repositories.EncargadoRepository;
import com.componentes.examenfinal_sharltonromero.services.IEncargadoService;
import com.componentes.examenfinal_sharltonromero.services.IHijoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EncargadoServiceImp implements IEncargadoService {

    @Autowired
    EncargadoRepository repository;

    @Override
    public void crear(Encargado encargado) {
        repository.save(encargado);
    }

    @Override
    public void actualizar(Encargado encargado) {
        Optional<Encargado> optEncargado = repository.findById(encargado.getCedula());
        if(!optEncargado.isPresent()) return;
        Encargado actEncargado = optEncargado.get();
        BeanUtils.copyProperties(encargado, actEncargado);
        repository.save(actEncargado);
    }

    @Override
    public Optional<Encargado> buscar(String cedula) {
        return repository.findById(cedula);
    }

    @Override
    public List<Encargado> buscarPorNombreOApellido(String nombre) {
        return repository.findByNombreContainingIgnoreCase(nombre);
    }

    @Override
    public List<Encargado> Todos() {
        return repository.findAll();
    }
}

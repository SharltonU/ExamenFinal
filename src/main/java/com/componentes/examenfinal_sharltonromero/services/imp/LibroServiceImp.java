package com.componentes.examenfinal_sharltonromero.services.imp;

import com.componentes.examenfinal_sharltonromero.models.Libro;
import com.componentes.examenfinal_sharltonromero.repositories.LibroRepository;
import com.componentes.examenfinal_sharltonromero.services.ILibroService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroServiceImp implements ILibroService {

    @Autowired
    LibroRepository repository;

    @Override
    public void crear(Libro libro) {
        repository.save(libro);
    }

    @Override
    public void actualizar(Libro libro) {
        Optional<Libro> optLibro = repository.findById(libro.getId());
        if(!optLibro.isPresent()) return;
        Libro actLibro = optLibro.get();
        BeanUtils.copyProperties(libro, actLibro);
        repository.save(actLibro);
    }

    @Override
    public List<Libro> buscarPorNombre(String nombre) {
        return repository.findByNombreContainingIgnoreCaseAndStatus(nombre, true);
    }

    @Override
    public List<Libro> Todos() {
        return repository.findAllByStatus(true);
    }

    @Override
    public void borrar(long id) {
       Libro lib = repository.findById(id).get();
       lib.setStatus(false);
       repository.save(lib);
    }
}

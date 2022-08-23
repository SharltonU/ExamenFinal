package com.componentes.examenfinal_sharltonromero.repositories;



import com.componentes.examenfinal_sharltonromero.models.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LibroRepository extends JpaRepository<Libro, Long> {
    public List<Libro> findByNombreContainingIgnoreCaseAndStatus(String nombre, boolean status);
    public List<Libro> findAllByStatus(boolean status);
}

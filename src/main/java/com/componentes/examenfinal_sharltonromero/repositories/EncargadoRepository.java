package com.componentes.examenfinal_sharltonromero.repositories;

import com.componentes.examenfinal_sharltonromero.models.Encargado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EncargadoRepository extends JpaRepository<Encargado, String> {
    public List<Encargado> findByNombreContainingIgnoreCase(String nombre);
}

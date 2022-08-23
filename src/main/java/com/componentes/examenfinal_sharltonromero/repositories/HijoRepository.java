package com.componentes.examenfinal_sharltonromero.repositories;

import com.componentes.examenfinal_sharltonromero.models.Encargado;
import com.componentes.examenfinal_sharltonromero.models.Hijo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HijoRepository extends JpaRepository<Hijo, String> {
    public List<Hijo> findByNombreContainingIgnoreCase(String nombre);
    public List<Hijo> findByPadreOrMadre(String cedulaP, String cedulaM);
}

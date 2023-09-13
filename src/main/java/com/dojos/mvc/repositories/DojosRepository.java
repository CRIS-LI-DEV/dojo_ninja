package com.dojos.mvc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.dojos.mvc.models.Dojo;

public interface DojosRepository extends CrudRepository <Dojo,Long> {
List<Dojo> findAll();

@Query("SELECT d FROM Dojo d")
List<Dojo> findAllDojos();



// obtener todos los nombre de los dojos.
@Query("SELECT d.nombre From Dojo d")
List<String> findAllDojosNames();





@Query("SELECT d FROM Dojo d WHERE id = ?1")
List<Dojo> getDojoWhereId(Long id);


}

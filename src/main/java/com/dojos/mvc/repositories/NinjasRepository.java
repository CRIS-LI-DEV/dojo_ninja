package com.dojos.mvc.repositories;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.dojos.mvc.models.*;
public interface NinjasRepository extends PagingAndSortingRepository<Ninja, Long> {
List<Ninja> findAll();


//@Query("SELECT d, n FROM Dojo d JOIN d.ninjas n")
//List<Object[]> joinDojosAndNinjas2();
}

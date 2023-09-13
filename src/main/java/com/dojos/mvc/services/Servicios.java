package com.dojos.mvc.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.dojos.mvc.models.Dojo;
import com.dojos.mvc.models.Ninja;
import com.dojos.mvc.repositories.DojosRepository;

import com.dojos.mvc.repositories.NinjasRepository;

@Service
@Transactional
public class Servicios {
private final NinjasRepository ninjasRepository;
private final DojosRepository dojosRepository;
@Autowired 

private static final int PAGE_SIZE = 5;


public Page<Ninja> ninjasPerPage(int pageNumber) {
    // Obtener todas las páginas de ninjas y clasificarlas en orden ascendente por apellido.
    PageRequest pageRequest = new PageRequest(pageNumber, PAGE_SIZE, Sort.Direction.ASC, "dojo_id");
    Page<Ninja> ninjas = ninjasRepository.findAll(pageRequest);
    return ninjasRepository.findAll(pageRequest);
}

	public Servicios(NinjasRepository ninjasRepository,DojosRepository dojosRepository) {
	this.ninjasRepository = ninjasRepository;
	this.dojosRepository = dojosRepository; 
	
	
}
	
	
	

	
	
	//MOSTRAR TODOS LOS DOJOS
	public List<Dojo> todosLosDojos(){
		
		return dojosRepository.findAll();
	}
	

	//MOSTRAR TODOS LOS DOJOS
	public List<Ninja> todxsLosNinjxs(){
		return ninjasRepository.findAll();
	}
	
	//GUARDAR DOJO
	public Dojo crearDojo(Dojo dojo) {
		return dojosRepository.save(dojo);
	} 

	//GUARDAR NINJXS
	public Ninja crearNinja(Ninja ninja) {
		return ninjasRepository.save(ninja);
	} 
	
	
	public Dojo buscaDojo(Long id) {
		Optional<Dojo> dojoO = dojosRepository.findById(id);
		Dojo dojo = dojoO.get();
		return dojo;
	}
	
	
	
	
	
	
	
	
	
	//ADVANCE QUERIES
	
	public List<Dojo> consulta1(){
		
		return dojosRepository.findAllDojos();
	}
	
	
	
public List<String> consulta2(){
		
		return dojosRepository.findAllDojosNames();
	}


}

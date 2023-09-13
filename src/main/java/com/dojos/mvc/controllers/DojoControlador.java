package com.dojos.mvc.controllers;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dojos.mvc.models.Dojo;
import com.dojos.mvc.models.Ninja;
import com.dojos.mvc.repositories.DojosRepository;
import com.dojos.mvc.services.Servicios;

@Controller
public class DojoControlador {
private final Servicios servicios;
	public DojoControlador(Servicios servicios){
		this.servicios = servicios;
	}
	
	
@RequestMapping("/dojos/new")
public String nuevoDojo( ) {

	return "vistas/nuevoDojo.jsp";
}


@RequestMapping("/ninjas/new")
public String nuevoNinja(Model model) {
	List<Dojo> dojos = servicios.todosLosDojos();
	System.out.println(dojos.get(0).getNombre());
	model.addAttribute("dojos", dojos);
	return "vistas/nuevaNinja.jsp";
}


@RequestMapping(value="/dojos", method=RequestMethod.POST)
public String guardarDojo(@RequestParam("nombre") String nombre) {
	Dojo dojo = new Dojo(nombre);
	servicios.crearDojo(dojo);
	return "/";
}


@RequestMapping(value="/ninjas", method=RequestMethod.POST)
public String guardarNinja(@RequestParam("nombre") String nombre,
						   @RequestParam("apellido") String apellido,
						   @RequestParam("idDojo") Long idDojo,
						   @RequestParam("edad") int edad
		) {
	Dojo dojo = servicios.buscaDojo(idDojo);
	Ninja ninja = new Ninja(nombre,apellido,edad,dojo);
	servicios.crearNinja(ninja);
	return "/";
}



@RequestMapping("/dojos/{id}")
public String Dojos( @PathVariable(value="id") Long id, Model model) {
	Dojo dojo = servicios.buscaDojo(id);
	model.addAttribute("dojo", dojo);
	model.addAttribute("ninas", dojo.getNinjas());
	return "vistas/dojos.jsp";
}


@RequestMapping("/")
public String muestraDojos(  Model model) {
	List<Dojo> dojos = servicios.todosLosDojos();
	model.addAttribute("dojos", dojos);

	return "vistas/muestraDojos.jsp";
}


@RequestMapping("/consultas/1")
public String consulta1() {
	List<Dojo> dojos = servicios.consulta1();
	System.out.println("Todos los dojos, atributos y metodos");
	for (Dojo d : dojos) {
		System.out.println("NOMBRE : " + d.getNombre() );
	}
	System.out.println();
	return"/";
}



@RequestMapping("/consultas/2")
public String consulta2() {
System.out.println("Nombre Dojos");
	List<String> nombreDojos = servicios.consulta2();
	System.out.println(nombreDojos);
	return"/";
}



@RequestMapping("/pages/{pageNumber}")
public String getNinjasPerPage(Model model, @PathVariable("pageNumber") int pageNumber) {
    //Tenemos que restar 1 porque las páginas iterables empiezan con índice 0. Esto es para que nuestros enlaces puedan mostrarse desde 1...maxPage(última página) 
    Page<Ninja> ninjas = servicios.ninjasPerPage(pageNumber - 1);
    //Total número de páginas que tenemos
    int totalPages = ninjas.getTotalPages();
    model.addAttribute("totalPages", totalPages);
    model.addAttribute("ninjas", ninjas);
    return "vistas/ninjas.jsp";
}




}

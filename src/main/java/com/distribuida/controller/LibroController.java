package com.distribuida.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.distribuida.dto.LibroService;
import com.distribuida.entities.Libro;

@Controller
@RequestMapping("/libros")
public class LibroController {
	
	
	
	@Autowired
	private LibroService libroService;
	
	
	
	
	
	@GetMapping("/findAll")
	public String findAll(Model model) {
		
		List<Libro> libros = libroService.findAll();
		
		model.addAttribute("libros", libros);
				
				
		return "libros";
		
		
	}
	
	@GetMapping("findOne")
	public String findOne(@RequestParam("idLibro") @Nullable Integer idLibro
			,@RequestParam("opcion") @Nullable Integer opcion
			,Model model
			
			) {
		
		if(idLibro != null) {
			
			Libro libro= libroService.findOne(idLibro);
			model.addAttribute("libro", libro);
		}
		
		if(opcion == 1) return "libros-add";
		else return "libros-del";
				
		
		
		
	}
	
	@PostMapping("/add")
	public String add(@RequestParam("libro")@Nullable Integer idLibro
			,@RequestParam("titulo") @Nullable String titulo
			,@RequestParam("editorial") @Nullable String editorial
			,@RequestParam("numPaginas") @Nullable Integer numPaginas
			,@RequestParam("edicion") @Nullable String edicion
			,@RequestParam("idioma") @Nullable String idioma
			,@RequestParam("fechaPublicacion") @Nullable Date fechaPublicacion
			,@RequestParam("tipoPasta") @Nullable String tipoPasta
			,@RequestParam("isbn") @Nullable String isbn
			,@RequestParam("numeroEjemplares") @Nullable String numeroEjemplares
			,@RequestParam("portada") @Nullable String portada
			,@RequestParam("presentacion") @Nullable String presentacion
			,@RequestParam("precio") @Nullable Double precio
			,@RequestParam("idCategoria") @Nullable Integer idCategoria
			,@RequestParam("idAutor") @Nullable Integer idAutor
			, Model model
			) {
		
		if (idLibro != null) libroService.add(0, titulo, editorial, numPaginas, edicion, idioma, fechaPublicacion, idioma, tipoPasta, isbn, numeroEjemplares, portada, presentacion, precio, 0, 0);
		else libroService.up(0, titulo, editorial, numPaginas, edicion, idioma, fechaPublicacion, idioma, tipoPasta, isbn, numeroEjemplares, portada, presentacion, precio, 0, 0);
		return "redirect:/libbros/findAll";
		
	}
	
	@GetMapping("/del")
	public String del(@RequestParam("idLibro")@Nullable Integer idLibro) {
		libroService.del(idLibro);
		return "redirect:/libros/findAll";
		
	}
	
	

}

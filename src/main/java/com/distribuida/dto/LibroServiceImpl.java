package com.distribuida.dto;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribuida.dao.AutorDAO;
import com.distribuida.dao.CategoriaDAO;
import com.distribuida.dao.LibroDAO;
import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Libro;


@Service
public class LibroServiceImpl implements LibroService{
	
	
	@Autowired
	private LibroDAO libroDAO;
	
	@Autowired
	private CategoriaDAO categoriaDAO;
	
	@Autowired
	private AutorDAO autorDAO;
	
	

	@Override
	public List<Libro> findAll() {
		// TODO Auto-generated method stub
		return libroDAO.findAll();
	}

	@Override
	public Libro findOne(int id) {
		// TODO Auto-generated method stub
		return libroDAO.findOne(id);
	}

	@Override
	public void add(Libro libro) {
		// TODO Auto-generated method stub
		Autor autor = autorDAO.findOne(libro.getAutor().getIdAutor());
		
	
		Categoria categoria = categoriaDAO.findOne(libro.getCategoria().getIdCategoria());
		
		if (autor  != null && categoria != null ) {
			
			libroDAO.add(libro);
			
		}
		
		
		
		
	}

	@Override
	public void up(Libro libro) {
		// TODO Auto-generated method stub
		libroDAO.up(libro);
		
		Autor autor = autorDAO.findOne(libro.getAutor().getIdAutor());
		
		
		Categoria categoria = categoriaDAO.findOne(libro.getCategoria().getIdCategoria());
		
		if (autor  != null && categoria != null ) {
			
			libroDAO.up(libro);
			
		}
	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		libroDAO.del(id);
		
	}

	@Override
	public List<Libro> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return libroDAO.findAll(busqueda);
	}

	
	@Override
	public void add(int idLibro, String titulo, String editorial, int numPaginas, String edicion, String idioma,
			Date fechaPublicacion, String descripcion, String tipoPasta, String isbn, String numeroEjemplares,
			String portada, String presentacion, Double precio, int idAutor, int idCategoria) {
		// TODO Auto-generated method stub
			Categoria categoria = categoriaDAO.findOne(idCategoria);
			Autor autor = autorDAO.findOne(idAutor);
			
		Libro libro = new Libro(idLibro, titulo,editorial,numPaginas, edicion, idioma,fechaPublicacion,descripcion, tipoPasta,isbn, numeroEjemplares, portada, presentacion, precio);
		libro.setCategoria(categoria);
		libro.setAutor(autor);
		
		libroDAO.add(libro);
		
	}
	
	@Override
	public void up(int idLibro, String titulo, String editorial, int numPaginas, String edicion, String idioma,
			Date fechaPublicacion, String descripcion, String tipoPasta, String isbn, String numeroEjemplares,
			String portada, String presentacion, Double precio, int idAutor, int idCategoria) {
		// TODO Auto-generated method stub
			Categoria categoria = categoriaDAO.findOne(idCategoria);
			Autor autor = autorDAO.findOne(idAutor);
			
		Libro libro = new Libro(idLibro, titulo,editorial,numPaginas, edicion, idioma,fechaPublicacion,descripcion, tipoPasta,isbn, numeroEjemplares, portada, presentacion,precio);
		libro.setCategoria(categoria);
		libro.setAutor(autor);
		
		libroDAO.up(libro);
		
	
		
	}

}

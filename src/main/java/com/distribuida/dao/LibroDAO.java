package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Libro;

public interface LibroDAO {

	List<Libro> findAll();

	Libro findOne(int id);

	void add(Libro libro);

	List<Libro> findAll(String busqueda);

	void del(int id);

	void up(Libro libro);
	
	// spring boot - CrudeRepository
}
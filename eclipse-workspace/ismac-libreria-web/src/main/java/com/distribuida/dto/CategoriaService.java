package com.distribuida.dto;

import java.util.List;

import com.distribuida.entities.Categoria;

public interface CategoriaService {
	
	public List<Categoria> findAll();

	public Categoria findOne(int id);

	public void add(Categoria categoria);

	public void up(Categoria categoria);

	public void del(int id);
	
	public List<Categoria> findAll(String busqueda);
	
	public void add(int idCategoria, String categoria, String descripcion);

	void up(int idCategoria, String categoria, String descripcion);

	


}

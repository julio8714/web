package com.distribuida.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.FacturaDetalle;


@Repository
public class CategoriaDAOImpl implements CategoriaDAO{
	
	
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	@Transactional
	public List<Categoria> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		
		
		return session.createQuery(" from Categoria", Categoria.class).getResultList();
	}

	@Override
	@Transactional
	public Categoria findOne(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.get(Categoria.class, id);
	}

	@Override
	@Transactional
	public void add(Categoria categoria) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(categoria);
		
	}

	@Override
	@Transactional
	public void up(Categoria categoria) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(categoria);
		
	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.delete(findOne(id));
	}

	@Override
	public List<Categoria> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return null;
	}
		
	//@Override
	//@Transactional
	//public List<Categoria> findAll(String busqueda) {
		// TODO Auto-generated method stub
		//Session session = sessionFactory.getCurrentSession();
		
		//Query<Categoria> query = session.createQuery(" SELECT ca FROM Categoria ca "
			//	+ " WHERE ca.categoria LIKE : busqueda "
				//+ " OR ca.descripcion LIKE : busqueda "
			//	, Categoria.class);
		//query.setParameter("busqueda","%"+busqueda+"%");
		
		//return  query.getResultList();
		
		
		
		
		
		
	
		
		
	
		

	

}

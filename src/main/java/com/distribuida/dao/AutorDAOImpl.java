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
import com.distribuida.entities.Cliente;




@Repository
public class AutorDAOImpl implements AutorDAO {
	
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Autor> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery(" from Autor", Autor.class).getResultList();
		
		
		//return session.createQuery("SELECT au FROM Autor au", Autor.class).getResultList();
	}

	@Override
	@Transactional
	public Autor findOne(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		//Query query = session.createQuery("SELECT au FROM Autor au WHERE au.idAutor =: keyidAutor");
		return session.get(Autor.class, id);
		
	//	query.setParameter("keyidAutor", id);
		
		
		
		//return (Autor) query.getSingleResult();
	}
	@Override
	@Transactional
	public void add(Autor autor) {
	// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(autor);
		
		
	}

	@Override
	@Transactional
	public void up(Autor autor) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(autor);
	//	Query query = session.createQuery(" UPDATE Autor SET nombre =: nombre, "
			//	+"apellido =: apellido, "
	       //     +"pais =: pais, "
			//	+"direccion =: direccion, "
			//	+"telefono =: telefono, "
			//	+"correo =: correo "
			//	+"WHERE idAutor =:  idAutor "
			//	);
	//	query.setParameter("nombre", autor.getNombre());
	//	query.setParameter("apellido", autor.getApellido());
	//	query.setParameter("pais", autor.getPais());
	//	query.setParameter("direccion", autor.getDireccion());
	//	query.setParameter("telefono", autor.getTelefono());
	//	query.setParameter("correo", autor.getCorreo());
	//	query.setParameter("idAutor", autor.getIdAutor());		
		
	//	query.executeUpdate();
		
		
		
	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		
		Session session = sessionFactory.getCurrentSession();
		session.delete(findOne(id));
		//Query query = session.createQuery("DELETE FROM Autor au WHERE au.idAutor =: idAutor");
		//query.setParameter("idAutor", id);
		
		
		
		//query.executeUpdate();
				
		
		
		
	}

	@Override
	public List<Autor> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
	//@Transactional
	//public List<Autor> findAll(String busqueda) {
		//TODO Auto-generated method stub
		
	//Session session = sessionFactory.getCurrentSession();
	//	Query query = session.createQuery("SELECT au FROM autor au " 
			  //  +" WHERE au.nombre LIKE : busqueda " 
			   // +" OR au.apellido LIKE : busqueda " 
				//+" OR au.pais LIKE : busqueda " 
				//+" OR au.direccion LIKE : busqueda " 
				//+" OR au.telefono LIKE : busqueda " 
				//+" OR au.correo LIKE : busqueda " 				
				//,Autor.class);
		//query.setParameter("busqueda", "%+busqueda+%");
	//return query.getResultList();
	}

//}

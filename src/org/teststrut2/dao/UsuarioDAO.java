package org.teststrut2.dao;
/**
 * 
 */


import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.teststrut2.pojo.Usuario;


/**
 * implementation of UsuarioDAOInterface
 * @author Pello Xabier Altadill Izura
 * @greetz Blue mug
 *
 */
public class UsuarioDAO implements UsuaioDAOInterface {

	
	private Session session;
	

	/**
	 * default constructor
	 */
	public UsuarioDAO () {
		
	
		//session = HibernateSession.getSession();
	}
	
	/* 
	 * selects one Usuario by Id
	 * @param id
	 * @return Usuario
	 */
	public Usuario selectById(int id) {
	    Usuario usuario = (Usuario) session.get(Usuario.class, id);
	    return usuario;
	}

	/*
	 * retrieves all Usuarios from db
	 * @return List of Usuarios
	 */
	public List<Usuario> selectAll() {
	 
	    List<Usuario> usuarios = session.createQuery("from Usuario").list();
	    return usuarios;
	}

	/*
	 * inserts a new Usuario in database
	 * retrieves generated id and sets to Usuario instance
	 * @param new Usuario
	 */
	public void insert(Usuario usuario) {
	    session.beginTransaction();
	 
	    Integer id = (Integer) session.save(usuario);
	   
	         
	    session.getTransaction().commit();
	         
	}

	/*
	 * updates Usuario
	 * @param Usuario to update
	 */
	public void update(Usuario usuario) {
		 
		    session.beginTransaction();
		 
		    session.merge(usuario);
		 
		    session.getTransaction().commit();
		 
	}

	/*
	 * delete given Usuario
	 * @param Usuario to delete
	 */
	public void delete(Usuario usuario) {
	    
	    session.beginTransaction();
	    
	    session.delete(usuario);
	 
	    session.getTransaction().commit();
	 
	}

}

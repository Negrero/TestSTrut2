package org.teststrut2.dao;


import java.util.List;

import org.teststrut2.pojo.Usuario;

/**
 * interface for UsuarioDAO class
 * @author Pello Xabier Altadill Izura
 *
 */
public interface UsuaioDAOInterface {
	
	public Usuario selectById(int id);
	public List<Usuario> selectAll ();
	public void insert (Usuario usuario);
	public void update (Usuario usuario);
	public void delete (Usuario usuario);

}

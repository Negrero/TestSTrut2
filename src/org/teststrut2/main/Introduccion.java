/**
 * 
 */
package org.teststrut2.main;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Andres
 *
 */

public class Introduccion extends ActionSupport  {
	
private String mensaje;
	
	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		this.mensaje = "Introduccioendome en Strut2";
		return SUCCESS;
	}

	/**
	 * @return the message
	 */
	public String getMensaje() {
		return mensaje;
	}

	/**
	 * @param message the message to set
	 */
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
}

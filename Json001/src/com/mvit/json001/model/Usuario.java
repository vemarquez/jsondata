package com.mvit.json001.model;

/**
 * @author javainstance
 *
 */
public class Usuario {

	private int nombreId;

	private String nombre;

	

	public Usuario(int nombreId, String nombre ) {
		super();
		this.nombreId = nombreId;
		this.nombre = nombre;
		
	}

	public int getnombreId() {
		return nombreId;
	}

	public void setnombreId(int nombreId) {
		this.nombreId = nombreId;
	}

	public String getnombre() {
		return nombre;
	}

	public void setnombre(String nombre) {
		this.nombre = nombre;
	}

	
}

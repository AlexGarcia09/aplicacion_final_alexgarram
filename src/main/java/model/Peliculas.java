package model;
// Generated 18 dic 2023 18:28:04 by Hibernate Tools 6.3.1.Final

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Peliculas generated by hbm2java
 */
public class Peliculas implements java.io.Serializable {

	private Integer id;
	private Usuarios usuarios;
	private String tituloPelicula;
	private String directorPelicula;
	private String resumenPelicula;
	private Date fechaPelicula;
	private String generoPelicula;
	private Set resenases = new HashSet(0);

	public Peliculas() {
	}

	public Peliculas(Usuarios usuarios, String tituloPelicula, String directorPelicula, String resumenPelicula,
			Date fechaPelicula, String generoPelicula, Set resenases) {
		this.usuarios = usuarios;
		this.tituloPelicula = tituloPelicula;
		this.directorPelicula = directorPelicula;
		this.resumenPelicula = resumenPelicula;
		this.fechaPelicula = fechaPelicula;
		this.generoPelicula = generoPelicula;
		this.resenases = resenases;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Usuarios getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
	}

	public String getTituloPelicula() {
		return this.tituloPelicula;
	}

	public void setTituloPelicula(String tituloPelicula) {
		this.tituloPelicula = tituloPelicula;
	}

	public String getDirectorPelicula() {
		return this.directorPelicula;
	}

	public void setDirectorPelicula(String directorPelicula) {
		this.directorPelicula = directorPelicula;
	}

	public String getResumenPelicula() {
		return this.resumenPelicula;
	}

	public void setResumenPelicula(String resumenPelicula) {
		this.resumenPelicula = resumenPelicula;
	}

	public Date getFechaPelicula() {
		return this.fechaPelicula;
	}

	public void setFechaPelicula(Date fechaPelicula) {
		this.fechaPelicula = fechaPelicula;
	}

	public String getGeneroPelicula() {
		return this.generoPelicula;
	}

	public void setGeneroPelicula(String generoPelicula) {
		this.generoPelicula = generoPelicula;
	}

	public Set getResenases() {
		return this.resenases;
	}

	public void setResenases(Set resenases) {
		this.resenases = resenases;
	}

}

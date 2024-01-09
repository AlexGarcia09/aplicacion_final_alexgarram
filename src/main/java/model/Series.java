package model;
// Generated 18 dic 2023 18:28:04 by Hibernate Tools 6.3.1.Final

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Series generated by hbm2java
 */
public class Series implements java.io.Serializable {

	private Integer id;
	private Usuarios usuarios;
	private String tituloSerie;
	private String directorSerie;
	private String resumenSerie;
	private Date fechaPelicula;
	private String generoPelicula;
	private Set resenases = new HashSet(0);

	public Series() {
	}

	public Series(Usuarios usuarios, String tituloSerie, String directorSerie, String resumenSerie, Date fechaPelicula,
			String generoPelicula, Set resenases) {
		this.usuarios = usuarios;
		this.tituloSerie = tituloSerie;
		this.directorSerie = directorSerie;
		this.resumenSerie = resumenSerie;
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

	public String getTituloSerie() {
		return this.tituloSerie;
	}

	public void setTituloSerie(String tituloSerie) {
		this.tituloSerie = tituloSerie;
	}

	public String getDirectorSerie() {
		return this.directorSerie;
	}

	public void setDirectorSerie(String directorSerie) {
		this.directorSerie = directorSerie;
	}

	public String getResumenSerie() {
		return this.resumenSerie;
	}

	public void setResumenSerie(String resumenSerie) {
		this.resumenSerie = resumenSerie;
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

package model;
// Generated 18 dic 2023 18:28:04 by Hibernate Tools 6.3.1.Final

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Anime generated by hbm2java
 */
public class Anime implements java.io.Serializable {

	private Integer id;
	private Usuarios usuarios;
	private String tituloAnime;
	private String directorAnime;
	private String resumenAnime;
	private Date fechaAnime;
	private String generoAnime;
	private Set resenases = new HashSet(0);

	public Anime() {
	}

	public Anime(Usuarios usuarios, String tituloAnime, String directorAnime, String resumenAnime, Date fechaAnime,
			String generoAnime, Set resenases) {
		this.usuarios = usuarios;
		this.tituloAnime = tituloAnime;
		this.directorAnime = directorAnime;
		this.resumenAnime = resumenAnime;
		this.fechaAnime = fechaAnime;
		this.generoAnime = generoAnime;
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

	public String getTituloAnime() {
		return this.tituloAnime;
	}

	public void setTituloAnime(String tituloAnime) {
		this.tituloAnime = tituloAnime;
	}

	public String getDirectorAnime() {
		return this.directorAnime;
	}

	public void setDirectorAnime(String directorAnime) {
		this.directorAnime = directorAnime;
	}

	public String getResumenAnime() {
		return this.resumenAnime;
	}

	public void setResumenAnime(String resumenAnime) {
		this.resumenAnime = resumenAnime;
	}

	public Date getFechaAnime() {
		return this.fechaAnime;
	}

	public void setFechaAnime(Date fechaAnime) {
		this.fechaAnime = fechaAnime;
	}

	public String getGeneroAnime() {
		return this.generoAnime;
	}

	public void setGeneroAnime(String generoAnime) {
		this.generoAnime = generoAnime;
	}

	public Set getResenases() {
		return this.resenases;
	}

	public void setResenases(Set resenases) {
		this.resenases = resenases;
	}

}

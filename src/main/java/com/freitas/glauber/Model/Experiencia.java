package com.freitas.glauber.Model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name="TB_EXPERIENCIA")
public class Experiencia implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)	
private Long id;
private String nome;
@Lob
private String sobre;
private String imagem;
@OneToMany
private List<Competencia> competencias;
@ManyToOne
private Usuario usuario;

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getSobre() {
	return sobre;
}
public void setSobre(String sobre) {
	this.sobre = sobre;
}
public String getImagem() {
	return imagem;
}
public void setImagem(String imagem) {
	this.imagem = imagem;
}
public Usuario getUsuario() {
	return usuario;
}
public void setUsuario(Usuario usuario) {
	this.usuario = usuario;
}



}

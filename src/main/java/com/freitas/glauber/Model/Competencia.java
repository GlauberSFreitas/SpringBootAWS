package com.freitas.glauber.Model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="TB_COMPETENCIA")
public class Competencia implements Serializable{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy = GenerationType.AUTO)	
private Long id;

private String nome;
private String resumo;
private String imagem;

@ManyToOne
private Experiencia experiencia;
@ManyToOne
private Usuario usuario;

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}

public String getResumo() {
	return resumo;
}
public void setResumo(String resumo) {
	this.resumo = resumo;
}
public String getImagem() {
	return imagem;
}
public void setImagem(String imagem) {
	this.imagem = imagem;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public Experiencia getExperiencia() {
	return experiencia;
}
public void setExperiencia(Experiencia experiencia) {
	this.experiencia = experiencia;
}
public Usuario getUsuario() {
	return usuario;
}
public void setUsuario(Usuario usuario) {
	this.usuario = usuario;
}




}

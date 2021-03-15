package com.freitas.glauber.Model;

import java.io.Serializable;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="TB_USUARIO")
public class Usuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private int idade;
	@Lob
	private String resumo;
	
	@OneToMany
	private List<Competencia> competencias;
	@OneToMany
	private List<Experiencia> experiencias;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getResumo() {
		return resumo;
	}
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	public Long getId() {
		return id;
	}
		
	
}

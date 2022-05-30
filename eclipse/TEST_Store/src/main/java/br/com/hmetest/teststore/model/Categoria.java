package br.com.hmetest.teststore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="categorias")
public class Categoria {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column
	private String nome;
	
	
	
	public Categoria() {
		
	}
	public Categoria(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	public Categoria(String nome) {
		this.nome=nome;
	}
	
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	

}

package br.com.hmetest.teststore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String nome;
	@Column
	private int idade;
	
	public Cliente() {
		super();
	}

	public Cliente(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public void cadastrar(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}
	
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
		
	
}

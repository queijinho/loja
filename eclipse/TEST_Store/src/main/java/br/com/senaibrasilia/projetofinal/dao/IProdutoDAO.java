package br.com.senaibrasilia.projetofinal.dao;

import java.util.List;

import br.com.hmetest.teststore.model.Categoria;
import br.com.hmetest.teststore.model.Produto;

public interface IProdutoDAO {

	void signin(Produto produto);
	void update(Produto produto);
	void remove(Produto produto);
	Produto findId(Long id);
	List<Produto> allName(String nome);
	List<Produto> findnames(String nome);
	
}

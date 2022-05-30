package br.com.senaibrasilia.projetofinal.dao;

import java.util.List;

import br.com.hmetest.teststore.model.Categoria;
import br.com.hmetest.teststore.model.Produto;

public interface ICategoriaDAO {

	void cadastrar(Categoria categoria);
	void atualizar(Categoria categoria);
	void remover(Categoria categoria);
	Categoria buscarPorId(Long id);
	List<Categoria> buscarPorNome(String nome);
	List<Categoria> buscarTodos(String nome);	
	
}

package br.com.senaibrasilia.projetofinal.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.hmetest.teststore.model.Categoria;
import br.com.hmetest.teststore.model.Produto;

public class ProdutoDAO implements IProdutoDAO{

	private EntityManager emDAOPro;
	
	public ProdutoDAO(EntityManager emDAOPro) {
		super();
		this.emDAOPro = emDAOPro;
	}

	@Override
	public void signin(Produto produto) {
		// TODO Auto-generated method stub
		emDAOPro.persist(produto);
	}

	@Override
	public void update(Produto produto) {
		// TODO Auto-generated method stub
		emDAOPro.persist(produto);
	}

	@Override
	public void remove(Produto produto) {
		// TODO Auto-generated method stub
		emDAOPro.merge(produto);
		emDAOPro.remove(produto);
	}

	@Override
	public Produto findId(Long id) {
		// TODO Auto-generated method stub
		return emDAOPro.find(Produto.class, id);
	}

	@Override
	public List<Produto> allName(String nome) {
		// TODO Auto-generated method stub
		String jpql = "SELECT produto FROM Produto produto";
		return emDAOPro.createQuery(jpql, Produto.class).getResultList();
	}

	@Override
	public List<Produto> findnames(String nome) {
		// TODO Auto-generated method stub
		String jpql = "SELECT produto FROM Categoria produto WHERE p.nome = :nome";
		return emDAOPro.createQuery(jpql, Produto.class)
				.setParameter("nome", nome)
				.getResultList();
	}

	

	

	

	
	
}

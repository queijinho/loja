package br.com.senaibrasilia.projetofinal.dao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

import br.com.hmetest.teststore.model.Categoria;
import br.com.hmetest.teststore.model.Produto;

public class CategoriaDAO implements ICategoriaDAO{

	private EntityManager emDAO;
	
	public CategoriaDAO(EntityManager emDAO) {
		super();
		this.emDAO = emDAO;
	}
	
	@Override
	public void cadastrar(Categoria categoria) {
		// TODO Auto-generated method stub
		emDAO.persist(categoria);
	}

	@Override
	public void atualizar(Categoria categoria) {
		// TODO Auto-generated method stub
		emDAO.persist(categoria);
	}

	@Override
	public void remover(Categoria categoria) {
		// TODO Auto-generated method stub
		emDAO.merge(categoria);
		emDAO.remove(categoria);
	}

	@Override
	public Categoria buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return emDAO.find(Categoria.class, id);
	}
	
	@Override
	public List<Categoria> buscarPorNome(String nome) {
		// TODO Auto-generated method stub
		String jpql = "SELECT categoria FROM Produto categoria";
		return emDAO.createQuery(jpql, Categoria.class).getResultList();
	}
	
	@Override
	public List<Categoria> buscarTodos(String nome) {
		// TODO Auto-generated method stub
		String jpql = "SELECT categoria FROM Categoria categoria WHERE p.nome = :nome";
		return emDAO.createQuery(jpql, Categoria.class)
				.setParameter("nome", nome)
				.getResultList();
	}

	
}

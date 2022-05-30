package br.com.senaibrasilia.projetofinal.dao;

import javax.persistence.EntityManager;

import br.com.hmetest.teststore.model.Cliente;

public class ClienteDAO implements IClienteDAO{

	private EntityManager emDAOCli;
	
	public ClienteDAO(EntityManager emDAOCli) {
		super();
		this.emDAOCli = emDAOCli;
	}

	@Override
	public void cadastrar(Cliente cliente) {
		// TODO Auto-generated method stub
		emDAOCli.persist(cliente);
	}

	@Override
	public void atualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		emDAOCli.persist(cliente);
	}

	@Override
	public void remover(Cliente cliente) {
		// TODO Auto-generated method stub
		emDAOCli.merge(cliente);
		emDAOCli.remove(cliente);
	}

}

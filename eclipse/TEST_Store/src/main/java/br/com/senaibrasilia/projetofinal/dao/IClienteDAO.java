package br.com.senaibrasilia.projetofinal.dao;


import br.com.hmetest.teststore.model.Cliente;

public interface IClienteDAO {

	void cadastrar(Cliente cliente);
	void atualizar(Cliente cliente);
	void remover(Cliente cliente);
}

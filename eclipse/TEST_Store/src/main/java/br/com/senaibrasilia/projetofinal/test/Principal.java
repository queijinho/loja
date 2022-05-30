package br.com.senaibrasilia.projetofinal.test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.hmetest.teststore.model.Categoria;
import br.com.hmetest.teststore.model.Cliente;
import br.com.hmetest.teststore.model.Produto;
import br.com.senaibrasilia.projetofinal.JPAUtil.JPAUtil;
import br.com.senaibrasilia.projetofinal.dao.CategoriaDAO;
import br.com.senaibrasilia.projetofinal.dao.ClienteDAO;
import br.com.senaibrasilia.projetofinal.dao.ProdutoDAO;

public class Principal {
	
	static EntityManager em = JPAUtil.getEntityManager();
	
	public static void cadastrodecliente() {
		Cliente cliente = new Cliente("Thaís Lima", 19);
		
		em = JPAUtil.getEntityManager();
		ClienteDAO clienteDao = new ClienteDAO(em);
		
		em.getTransaction().begin();
		
		clienteDao.cadastrar(cliente);
		
		
		em.getTransaction().commit();//salvar  no banco
		em.close();
	}
	
	public static void cadastrarProduto() {
		Categoria eletronica = new Categoria("Eletrônica");
		Categoria celulares = new Categoria("Celulares");
		Produto produto = new Produto("Mouse","Mouse Dell Optico",new BigDecimal("100"), eletronica);
		Produto celular = new Produto("Xiami Redmi", "Muito Legal", new BigDecimal("100"), celulares);
		
		em = JPAUtil.getEntityManager();
		ProdutoDAO produtoDao = new ProdutoDAO(em);
		CategoriaDAO categoriaDao = new CategoriaDAO(em);
		
		em.getTransaction().begin();
		
		categoriaDao.cadastrar(celulares);
		produtoDao.signin(celular);
		
		//em.persist(produto);
		//em.persist(eletronica);
		//cate.cadastrar(produto);
		em.getTransaction().commit();//salvar  no banco
		em.close();
				
	}
	
	public static void comandos() {
		ProdutoDAO produtoDao = new ProdutoDAO(em);
		
		Produto produto = produtoDao.findId((long)1);
		System.out.println(produto.getPreco());
		
		//List<Produto> todos = 
				//produtoDao.allnames("CELULARES");
				//todos.forEach(p2->System.out.println(produto.getNome()));
				
		//BigDecimal precodoProduto = 
				//(BigDecimal) produtoDao.findName("Xiami Redmi");
				//System.out.println("Preço do produto:"+produto.getPreco());
		
	}
	
	public static void main(String[] args) {
		cadastrarProduto();
		cadastrodecliente();
        ProdutoDAO produtoDao = new ProdutoDAO(em);
        
           		
	}
	
}

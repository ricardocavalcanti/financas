package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Cliente;
import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TesteContaCliente {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		cliente.setNome("Leonardo");
		cliente.setEndereco("Rua Prof Silvio Rabelo, 956");
		cliente.setProfissao("Analista");
		
		
		Cliente cliente2 = new Cliente();
		cliente.setNome("Ricardo");
		cliente.setEndereco("Rua Prof Silvio Rabelo, 956");
		cliente.setProfissao("Analista");

		Conta conta = new Conta();
		conta.setId(2);
		
		cliente.setConta(conta);
		cliente2.setConta(conta);

		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.persist(cliente);	
		//em.persist(cliente2);	
		em.getTransaction().commit();

	}

}

package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;
import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TesteConta {

	public static void main(String[] args) {

		Conta conta = new Conta();
		conta.setTitular("Danilo");
		conta.setAgencia("Banco do Brasil");
		conta.setBanco("Caixa Economica");
		conta.setNumero("456");

		EntityManager em = new JPAUtil().getEntityManager();
		

		em.getTransaction().begin();
		em.persist(conta);
		
		conta.setBanco("Bradesco");
		
		
		em.getTransaction().commit();

		em.close();
		

	}

}

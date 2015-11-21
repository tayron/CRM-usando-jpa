package br.com.crm.entidades.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Classe utilitária para disponibilizar recursos para gerencia entidades
 */
public class EntityUtils {

	/**
	 * Retorna auma fábrica de conexão
	 */
	private EntityManagerFactory getEntityManagerFactory(){
		return Persistence.createEntityManagerFactory("CRMJpa");
	}
	
	/**
	 * Retorna uma entidade para gerenciamento de recursos no banco de dados
	 */
	public EntityManager getEntityManager(){
		return getEntityManagerFactory().createEntityManager();
	}
}

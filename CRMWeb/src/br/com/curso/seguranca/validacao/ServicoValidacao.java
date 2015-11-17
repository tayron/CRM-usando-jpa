/**
 * ServicoValidacao.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.curso.seguranca.validacao;

import br.com.crm.negocio.excecoes.ExcecaoNegocio;

/**
 * 
 * @author tayron
 *
 */
public interface ServicoValidacao extends java.rmi.Remote {
	
	/**
	 * 
	 * @param senha
	 * @return
	 * @throws java.rmi.RemoteException
	 * @throws ExcecaoNegocio
	 */
    public boolean validarSenha(java.lang.String senha) throws java.rmi.RemoteException, ExcecaoNegocio;
}

/**
 * ServicoValidacaoService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.curso.seguranca.validacao;

/**
 * 
 * @author tayron
 *
 */
public interface ServicoValidacaoService extends javax.xml.rpc.Service {
	
	/**
	 * 
	 * @return
	 */
    public java.lang.String getServicoValidacaoAddress();

    /**
     * 
     * @return
     * @throws javax.xml.rpc.ServiceException
     */
    public br.com.curso.seguranca.validacao.ServicoValidacao getServicoValidacao() throws javax.xml.rpc.ServiceException;

    /**
     * 
     * @param portAddress
     * @return
     * @throws javax.xml.rpc.ServiceException
     */
    public br.com.curso.seguranca.validacao.ServicoValidacao getServicoValidacao(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}

package br.com.crm.entidades.pessoas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Entity Bean para representação de um usuário
 */
@Entity
@Table(name="usuarios")
public class Usuario extends Pessoa{
	
	/**
	 * Armazena o login do usuário 
	 */
	@Column(name="login", nullable=false, length=6)
	private String login;
	
	/**
	 * Armazena a senha do usuário
	 */
	@Column(name="senha", nullable=false, length=6)
	private String senha;
	
	/**
	 * Armazena a senha de confirmação do usuário
	 */
	@Transient
	private String confirmaSenha;

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}

	/**
	 * @return the confirmaSenha
	 */
	public String getConfirmaSenha() {
		return confirmaSenha;
	}

	/**
	 * @param confirmaSenha the confirmaSenha to set
	 */
	public void setConfirmaSenha(String confirmaSenha) {
		this.confirmaSenha = confirmaSenha;
	}	
}

package br.com.estudo.keycloak.auth.domain.exception;

public class ConflitoException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ConflitoException(String message) {
		super(message);
	}
}
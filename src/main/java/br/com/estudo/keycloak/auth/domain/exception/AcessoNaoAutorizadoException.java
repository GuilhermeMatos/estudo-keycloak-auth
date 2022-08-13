package br.com.estudo.keycloak.auth.domain.exception;

public class AcessoNaoAutorizadoException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public AcessoNaoAutorizadoException(String message) {
		super(message);
	}
}
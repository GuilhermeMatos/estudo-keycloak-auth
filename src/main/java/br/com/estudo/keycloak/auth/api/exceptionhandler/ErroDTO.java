package br.com.estudo.keycloak.auth.api.exceptionhandler;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Value;

import java.util.Set;

@Builder
@Value
@JsonInclude(Include.NON_NULL)
public class ErroDTO {

	private String mensagem;
	
	@Schema(hidden = true)
	private Set<Validacao> validacoes;
	
	public static Validacao validacaoOf(final String campo, final String mensagem) {
		return Validacao.builder()
				.campo(campo)
				.mensagem(mensagem)
				.build();
	}
	
	@Builder
	@Value
	protected static class Validacao {
		private String campo;
		private String mensagem;
	}
}
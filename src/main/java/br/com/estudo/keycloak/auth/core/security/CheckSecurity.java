package br.com.estudo.keycloak.auth.core.security;

import org.springframework.security.access.prepost.PreAuthorize;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public @interface CheckSecurity {

	public @interface Portal {
		
		@PreAuthorize("hasAuthority('ADM_OPERACIONAL')")
		@Retention(RetentionPolicy.RUNTIME)
		@Target(ElementType.METHOD)
		public @interface adminOperacional {}

		@PreAuthorize("hasAuthority('ADM_COMERCIAL')")
		@Retention(RetentionPolicy.RUNTIME)
		@Target(ElementType.METHOD)
		public @interface adminComercial {}

		@PreAuthorize("hasAuthority('EMPRESARIAL_ADM')")
		@Retention(RetentionPolicy.RUNTIME)
		@Target(ElementType.METHOD)
		public @interface empresialAdm {}

		@PreAuthorize("hasAuthority('EMPRESARIAL_COMERCIAL')")
		@Retention(RetentionPolicy.RUNTIME)
		@Target(ElementType.METHOD)
		public @interface empresarialComercial {}
	}
}
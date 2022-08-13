package br.com.estudo.keycloak.auth.api.v1;

import br.com.estudo.keycloak.auth.core.security.CheckSecurity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "Controle de usuarios")
@RequestMapping(value = "/usuario", produces = MediaType.APPLICATION_JSON_VALUE)
@Slf4j
public class UsuarioController {

    @CheckSecurity.Portal.adminOperacional
    @GetMapping
    public ResponseEntity<String> getUsuario() {
        log.info("CADASTRO DE HORÁRIO.");

        log.info("Retornando resposta para o cliente.");
        return ResponseEntity.ok("Teste para ver se vai dar baum");
    }
}

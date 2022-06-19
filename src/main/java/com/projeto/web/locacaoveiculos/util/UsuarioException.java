package com.projeto.web.locacaoveiculos.util;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class UsuarioException extends ResponseStatusException {

    public UsuarioException(String mensagem) {
        super(HttpStatus.INTERNAL_SERVER_ERROR,mensagem);
    }
}

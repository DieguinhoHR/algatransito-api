package com.algaworks.algatransito.domain.exception;

// N precisa tratar essa exceção
public class NegocioException extends RuntimeException {

    public NegocioException(String message) {
        super(message);
    }
}

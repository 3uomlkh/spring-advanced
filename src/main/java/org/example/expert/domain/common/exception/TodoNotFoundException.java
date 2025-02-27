package org.example.expert.domain.common.exception;

import org.example.expert.config.ErrorMessage;

public class TodoNotFoundException extends RuntimeException {
    public TodoNotFoundException() {
        super(ErrorMessage.TODO_NOT_FOUND.getMessage());
    }
}

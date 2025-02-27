package org.example.expert.domain.common.exception;

import org.example.expert.config.ErrorMessage;

public class InvalidTodoOwnerException extends RuntimeException {
    public InvalidTodoOwnerException() {
        super(ErrorMessage.INVALID_TODO_OWNER.getMessage());
    }
}

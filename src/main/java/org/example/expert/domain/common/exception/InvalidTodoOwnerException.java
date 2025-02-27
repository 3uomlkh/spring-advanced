package org.example.expert.domain.common.exception;

public class InvalidTodoOwnerException extends RuntimeException {
    public InvalidTodoOwnerException() {
        super(ErrorMessage.INVALID_TODO_OWNER.getMessage());
    }
}

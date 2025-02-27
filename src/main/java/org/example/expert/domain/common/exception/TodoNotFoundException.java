package org.example.expert.domain.common.exception;

public class TodoNotFoundException extends RuntimeException {
    public TodoNotFoundException() {
        super(ErrorMessage.TODO_NOT_FOUND.getMessage());
    }
}

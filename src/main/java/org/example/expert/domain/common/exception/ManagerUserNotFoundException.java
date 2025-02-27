package org.example.expert.domain.common.exception;

public class ManagerUserNotFoundException extends RuntimeException {
    public ManagerUserNotFoundException() {
        super(ErrorMessage.MANAGER_USER_NOT_FOUND.getMessage());
    }
}

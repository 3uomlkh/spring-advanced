package org.example.expert.domain.common.exception;

import org.example.expert.config.ErrorMessage;

public class ManagerUserNotFoundException extends RuntimeException {
    public ManagerUserNotFoundException() {
        super(ErrorMessage.MANAGER_USER_NOT_FOUND.getMessage());
    }
}

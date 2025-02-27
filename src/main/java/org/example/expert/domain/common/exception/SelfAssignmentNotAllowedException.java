package org.example.expert.domain.common.exception;

import org.example.expert.config.ErrorMessage;

public class SelfAssignmentNotAllowedException extends RuntimeException {
    public SelfAssignmentNotAllowedException() {
        super(ErrorMessage.CANNOT_ASSIGN_SELF.getMessage());
    }
}

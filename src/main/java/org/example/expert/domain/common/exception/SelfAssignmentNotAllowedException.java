package org.example.expert.domain.common.exception;

public class SelfAssignmentNotAllowedException extends RuntimeException {
    public SelfAssignmentNotAllowedException() {
        super(ErrorMessage.CANNOT_ASSIGN_SELF.getMessage());
    }
}

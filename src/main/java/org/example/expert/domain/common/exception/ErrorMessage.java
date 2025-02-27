package org.example.expert.domain.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorMessage {
    TODO_NOT_FOUND("일정을 찾을 수 없습니다."),
    INVALID_TODO_OWNER("담당자를 등록하려고 하는 유저가 일정을 만든 유저가 유효하지 않습니다."),
    MANAGER_USER_NOT_FOUND("등록하려고 하는 담당자 유저가 존재하지 않습니다."),
    CANNOT_ASSIGN_SELF("일정 작성자는 본인을 담당자로 등록할 수 없습니다.");

    private final String message;
}

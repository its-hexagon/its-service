package com.its.service.common.error.code;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ChoiceErrorCode implements ErrorCode{
    CHOICE_NOT_FOUND(HttpStatus.NOT_FOUND, "CHOICE-001", "해당 선지는 존재하지 않습니다."),
    CHOICE_ALREADY_EXISTS(HttpStatus.CONFLICT, "CHOICE-002", "해당 선지는 이미 존재합니다."),
    CHOICE_ACCESS_DENIED(HttpStatus.FORBIDDEN, "CHOICE-003", "해당 선지에 접근 권한이 없습니다.");
    private final HttpStatus httpStatus;
    private final String code;
    private final String message;
}

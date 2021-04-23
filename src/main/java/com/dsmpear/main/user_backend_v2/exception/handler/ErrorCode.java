package com.dsmpear.main.user_backend_v2.exception.handler;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@JsonFormat(pattern = "yyyy--MM--dd HH:mm:ss", timezone = "Asia/Seoul")
public enum ErrorCode {
    INVALID_TOKEN(400, "AUTH400-0", "Invalid Token"),
    USER_NOT_FOUND(404, "USER404-0", "User Not Found"),
    REPORT_NOT_FOUND(404, "REPORT404-0", "Report Not Found"),
    INVALID_ACCESS(401, "REPORT401-0", "Invalid Access");

    private final int status;
    private final String code;
    private final String message;
}

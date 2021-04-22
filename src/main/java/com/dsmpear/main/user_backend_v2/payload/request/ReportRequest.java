package com.dsmpear.main.user_backend_v2.payload.request;

import com.dsmpear.main.user_backend_v2.entity.report.Access;
import com.dsmpear.main.user_backend_v2.entity.report.Field;
import com.dsmpear.main.user_backend_v2.entity.report.Grade;
import com.dsmpear.main.user_backend_v2.entity.report.Type;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReportRequest {

    @NotBlank
    private String title;

    @NotBlank
    private String description;

    private List<String> languages;

    @NotNull
    private Type type;

    @NotNull
    private Access access;

    @NotNull
    private Field field;

    @NotNull
    private Grade grade;

    @NotNull
    private Boolean isSubmitted;

    private String github;

    private String teamName;

}
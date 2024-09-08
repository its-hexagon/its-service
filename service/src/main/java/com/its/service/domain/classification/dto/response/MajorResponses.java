package com.its.service.domain.classification.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

import java.util.List;

@Schema(description = "대과목 목록 응답 DTO")
@Builder
public record MajorResponses(
        @Schema(description = "대과목 목록") List<MajorResponse> majors
) {}
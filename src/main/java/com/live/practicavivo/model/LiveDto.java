package com.live.practicavivo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class LiveDto {
    private Long id;
    private String nameSession;
    private String codeSession;
    private Long quantity;
    private Boolean state;
}

package com.live.practicavivo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Entity
@Table(name = "t_live")
public class Live {

    @Id
    private Long id;
    private String nameSession;
    private String codeSession;
    private Long quantity;
    private Boolean state;
}

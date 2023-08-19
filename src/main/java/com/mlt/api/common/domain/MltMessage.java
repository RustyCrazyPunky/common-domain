package com.mlt.api.common.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.mlt.api.common.constantes.DateFormatConstants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class MltMessage implements Serializable {

    private String message;
    private String code;
    @JsonFormat(pattern = DateFormatConstants.DATE_TIME_FORMAT)
    private LocalDateTime timestamp;
    private int status;

}

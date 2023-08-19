package com.mlt.api.common.domain.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PageableMltRequest extends MltRequest {

    @NotNull
    @Positive
    private Integer page;
    @NotNull
    @Positive
    private Integer size;
    @NotBlank
    private String sort;

}

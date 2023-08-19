package com.mlt.api.common.domain.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Builder(builderMethodName = "pagedDataBuilder")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MltPagedData extends MltData {

    private Long totalElements;
    private Integer totalPages;
    private Integer size;
    private Integer page;

}

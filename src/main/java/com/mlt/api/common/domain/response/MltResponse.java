package com.mlt.api.common.domain.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.mlt.api.common.domain.MltMessage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MltResponse<T extends MltData> implements Serializable {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<MltMessage> messages;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private MltMessage error;

    public void addMessage(MltMessage message) {
        if (Objects.isNull(messages)) {
            this.messages = List.of();
        }
        this.messages.add(message);
    }

}

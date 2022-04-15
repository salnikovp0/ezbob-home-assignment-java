package com.example.serviceshuffle.model;

import lombok.Data;
import org.hibernate.validator.constraints.Range;
import javax.validation.constraints.NotNull;

@Data
public class ShuffleRequest {
    @NotNull
    @Range(min=1, max=1000)
    private Integer value;
}

package com.atividade_dac.dac.controller.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataRequest {

    private String code;
    private String text;
    private Boolean confirmed;
}

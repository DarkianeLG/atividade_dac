package com.atividade_dac.dac.mapper.postgres;

import com.atividade_dac.dac.controller.request.DataRequest;
import com.atividade_dac.dac.model.postgres.DataPostgres;

public class DataPostgresMapper {
    public static DataPostgres toEntityPostgres(DataRequest request) {
        return DataPostgres.builder()
                .code(request.getCode())
                .text(request.getText())
                .confirmed(request.getConfirmed())
                .build();
    }
}

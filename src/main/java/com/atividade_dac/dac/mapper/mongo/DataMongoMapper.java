package com.atividade_dac.dac.mapper.mongo;

import com.atividade_dac.dac.controller.request.DataRequest;
import com.atividade_dac.dac.model.mongo.DataMongo;

public class DataMongoMapper {

    public static DataMongo toEntityMongo(DataRequest request) {
        return DataMongo.builder()
                .code(request.getCode())
                .text(request.getText())
                .confirmed(request.getConfirmed())
                .build();
    }
}

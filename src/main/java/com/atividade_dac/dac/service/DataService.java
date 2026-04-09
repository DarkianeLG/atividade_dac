package com.atividade_dac.dac.service;

import com.atividade_dac.dac.controller.request.DataRequest;
import com.atividade_dac.dac.model.mongo.DataMongo;
import com.atividade_dac.dac.model.postgres.DataPostgres;
import com.atividade_dac.dac.repository.mongo.DataMongoRepository;
import com.atividade_dac.dac.repository.postgres.DataPostgresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.atividade_dac.dac.mapper.mongo.DataMongoMapper.toEntityMongo;
import static com.atividade_dac.dac.mapper.postgres.DataPostgresMapper.toEntityPostgres;

@Service
public class DataService {

    @Autowired
    private DataPostgresRepository dataPostgresRepository;

    @Autowired
    private DataMongoRepository dataMongoRepository;

    public void saveData(DataRequest dataRequest) {

        DataPostgres dataPostgres = toEntityPostgres(dataRequest);
        DataMongo dataMongo = toEntityMongo(dataRequest);

        dataPostgresRepository.save(dataPostgres);
        dataMongoRepository.save(dataMongo);
    }
}

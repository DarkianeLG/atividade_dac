package com.atividade_dac.dac.repository.mongo;

import com.atividade_dac.dac.model.mongo.DataMongo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DataMongoRepository extends MongoRepository<DataMongo, String> {
}

package com.atividade_dac.dac.model.mongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "TbData")
@Getter
@Setter
public class DataMongo {

    @Id
    private String code;
    private String text;
    private Boolean confirmed;
}
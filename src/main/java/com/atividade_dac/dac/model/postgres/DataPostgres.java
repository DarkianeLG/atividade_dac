package com.atividade_dac.dac.model.postgres;

import jakarta.persistence.*;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "tb_data")
public class DataPostgres {

    @Id
    private String code;
    private String text;
    private Boolean confirmed;
}

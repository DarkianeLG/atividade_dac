package com.atividade_dac.dac.repository.postgres;

import com.atividade_dac.dac.model.postgres.DataPostgres;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataPostgresRepository extends JpaRepository<DataPostgres, Long> {
}

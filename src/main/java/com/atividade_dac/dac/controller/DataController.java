package com.atividade_dac.dac.controller;

import com.atividade_dac.dac.controller.request.DataRequest;
import com.atividade_dac.dac.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/data")
public class DataController {

    @Autowired
    private DataService DataService;

    @PostMapping
    @ResponseStatus(CREATED)
    public void saveData(@RequestBody DataRequest dataRequest) {
        DataService.saveData(dataRequest);
    }
}

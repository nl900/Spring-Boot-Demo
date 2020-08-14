package com.SpringApplication.service;

import com.SpringApplication.dao.ExampleDAO;
import com.SpringApplication.entities.Example;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.PostConstruct;

@Service
public class DataFillerService {
    private final ExampleDAO exampleDAO;

    public DataFillerService(ExampleDAO exampleDAO) {
        this.exampleDAO = exampleDAO;
    }

    @PostConstruct
    @Transactional
    public void fillData(){
        Example example1 = new Example("A silly example");

        exampleDAO.save(example1);
    }
}

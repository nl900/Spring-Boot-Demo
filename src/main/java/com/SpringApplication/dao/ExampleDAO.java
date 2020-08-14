package com.SpringApplication.dao;

import com.SpringApplication.entities.Example;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;
public interface ExampleDAO extends CrudRepository<Example, UUID> {
}

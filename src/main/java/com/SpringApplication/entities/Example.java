package com.SpringApplication.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Example extends EntityWithUUID {
    private String name;

//    public Example(String name) {
//        this.name   =name;
//    }
}

package com.sakigake.model.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;

@Entity
@Data
public class scheduleEntity {

    @Id
    private String id;

    private String title;



}

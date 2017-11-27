package com.sakigake.model.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import java.util.Date;

@Entity
@Data
public class scheduleEntity {

    private String id;

    private String title;

    private String description;

    private Date startDate;

    private Date endDate;




}

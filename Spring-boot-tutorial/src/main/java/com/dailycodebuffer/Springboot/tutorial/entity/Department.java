package com.dailycodebuffer.Springboot.tutorial.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long departmentId;

    /*@NotBlank(message ="Please add department name ")
    @Length(max = 5,min = 1)
    @Size(max = 10,min = 0)*/
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;

}
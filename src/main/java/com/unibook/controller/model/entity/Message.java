package com.unibook.controller.model.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Getter
@Setter
public class Message {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;

    private String text;
    private String tag;

}

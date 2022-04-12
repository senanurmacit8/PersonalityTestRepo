package com.questions_application.questions_application_0_0_1.model.person;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "T_PERSON")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SURNAME")
    private String surname;

}

package com.questions_application.questions_application_0_0_1.model.form;

import javax.persistence.*;

@Entity
@Table(name = "T_FORM")
public class Form {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "FORM_NAME")
    private String formName;
}

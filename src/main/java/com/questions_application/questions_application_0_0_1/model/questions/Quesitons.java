package com.questions_application.questions_application_0_0_1.model.questions;

import com.questions_application.questions_application_0_0_1.model.Form;
import com.questions_application.questions_application_0_0_1.model.categories.Categories;

import javax.persistence.*;

@Entity
@Table(name = "T_QUESTIONS")
public class Quesitons {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID")
    private Categories categoriesId;

    @Column(name = "PARENT_ID")
    private Integer parentId;

    @Column(name = "QUESTION")
    private String question;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID")
    private Form formId;

}

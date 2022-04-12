package com.questions_application.questions_application_0_0_1.model.form;

import com.questions_application.questions_application_0_0_1.model.person.Person;
import com.questions_application.questions_application_0_0_1.model.questions.Questions;

import javax.persistence.*;

@Entity
@Table(name = "T_FORM_ANSWERS")
public class FormAnswers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID")
    private Form formId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID")
    private Person personId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID")
    private Questions questionId;

    @Column(name = "ANSWER")
    private String answer;
}

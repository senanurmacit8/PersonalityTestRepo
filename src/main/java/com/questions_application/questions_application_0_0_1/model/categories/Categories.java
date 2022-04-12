package com.questions_application.questions_application_0_0_1.model.categories;

import javax.persistence.*;

@Entity
@Table(name = "T_CATEGORIES")
public class Categories  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    private String categoriesName;
}

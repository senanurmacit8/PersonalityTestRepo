package com.questions_application.questions_application_0_0_1.model.questions;

import com.questions_application.questions_application_0_0_1.model.categories.Categories;
import com.questions_application.questions_application_0_0_1.model.form.Form;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "T_QUESTIONS" , schema = "DEV")
public class Questions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID")
    private Categories categoriesId;

    @Column(name = "QUESTION")
    private String question;

    @Column(name = "PARENT_ID")
    private Integer parentId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID")
    private Form formId;

}

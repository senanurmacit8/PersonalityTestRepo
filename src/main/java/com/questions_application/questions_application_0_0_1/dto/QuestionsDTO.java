package com.questions_application.questions_application_0_0_1.dto;

import com.questions_application.questions_application_0_0_1.model.categories.Categories;
import com.questions_application.questions_application_0_0_1.service.constants.QuestionsTypeEnum;
import lombok.Data;

@Data
public class QuestionsDTO {

    String question;
    CategoriesDTO categoriesDTO;
    FormDTO formDTO;
    Integer parentId;
    QuestionsTypeEnum questionsTypeEnum;
    String options;

}

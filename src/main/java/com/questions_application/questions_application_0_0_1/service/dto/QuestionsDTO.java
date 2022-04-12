package com.questions_application.questions_application_0_0_1.service.dto;

import lombok.Data;

@Data
public class QuestionsDTO {

    String questions;
    String categoriesName;
    QuestionTypeDTO questionTypeDTO;
    Long childQuestionId;

}

package com.questions_application.questions_application_0_0_1.service.dto;

import com.questions_application.questions_application_0_0_1.service.constants.QuestionsTypeEnum;
import lombok.Data;

@Data
public class QuestionTypeDTO {
    QuestionsTypeEnum questionsTypeEnum;
    String options;
}

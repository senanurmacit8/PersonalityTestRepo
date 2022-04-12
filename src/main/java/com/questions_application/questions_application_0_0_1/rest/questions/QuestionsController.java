package com.questions_application.questions_application_0_0_1.rest.questions;

import com.questions_application.questions_application_0_0_1.dto.QuestionsDTO;

import java.util.List;

public interface QuestionsController {

    List<QuestionsDTO> getAllQuestionsByFormId(Integer id);

    QuestionsDTO getConditionalQuestions(Integer questionId);

    void saveAllQuestions(List<QuestionsDTO> questionsDTOList);

}

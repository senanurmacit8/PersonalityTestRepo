package com.questions_application.questions_application_0_0_1.service.questions;

import com.questions_application.questions_application_0_0_1.model.questions.Quesitons;
import com.questions_application.questions_application_0_0_1.service.dto.QuestionsDTO;

import java.util.List;

public interface QuestionsService {

     List<Quesitons> getAllQuestions();

     QuestionsDTO getConditionalQuestions(Long questionId);

     void saveAll(List<QuestionsDTO> questionsDTOList);

}



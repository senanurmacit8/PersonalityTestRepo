package com.questions_application.questions_application_0_0_1.rest;

import com.questions_application.questions_application_0_0_1.dto.QuestionsDTO;

import java.util.List;


public interface PersonalityTestRestController {

     List<QuestionsDTO> getQuestions();

     QuestionsDTO getConditionalQuestions(Integer questionId);

     void saveAllQuestions(List<QuestionsDTO> questionsDTOList);



}

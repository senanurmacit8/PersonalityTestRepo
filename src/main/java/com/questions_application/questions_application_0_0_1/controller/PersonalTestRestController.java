package com.questions_application.questions_application_0_0_1.controller;

import com.questions_application.questions_application_0_0_1.service.dto.QuestionsDTO;

import java.util.List;


public interface PersonalTestRestController {

     List<QuestionsDTO> getQuestions();

     QuestionsDTO getConditionalQuestions(Long questionId);

     void saveAllQuestions(List<QuestionsDTO> questionsDTOList);



}

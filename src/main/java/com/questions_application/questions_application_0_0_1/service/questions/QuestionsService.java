package com.questions_application.questions_application_0_0_1.service.questions;

import com.questions_application.questions_application_0_0_1.model.questions.Questions;

import java.util.List;

public interface QuestionsService {

     List<Questions> getAllQuestions();

     Questions getConditionalQuestions(Integer questionId);

     void saveAll(List<Questions> questionsDTOList);

}



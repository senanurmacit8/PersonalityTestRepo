package com.questions_application.questions_application_0_0_1.rest.form;

import com.questions_application.questions_application_0_0_1.dto.FormAnswersDTO;

import java.util.List;


public interface PersonalityTestRestController {

     void saveAnswers(List<FormAnswersDTO> formAnswersDTOList);

}

package com.questions_application.questions_application_0_0_1.rest.form.impl;

import com.questions_application.questions_application_0_0_1.dto.FormAnswersDTO;
import com.questions_application.questions_application_0_0_1.mapper.form.FormAnswersMapper;
import com.questions_application.questions_application_0_0_1.rest.form.PersonalityTestRestController;
import com.questions_application.questions_application_0_0_1.service.form.FormAnswersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/form")
public class PersonalityTestRestControllerImpl implements PersonalityTestRestController {

    @Autowired
    FormAnswersService formAnswersService;

    @Autowired
    FormAnswersMapper mapper;

    @Override
    public void saveAnswers(List<FormAnswersDTO> formAnswersDTOList) {
       formAnswersService.saveAnswers(mapper.mapToList(formAnswersDTOList));
    }
}

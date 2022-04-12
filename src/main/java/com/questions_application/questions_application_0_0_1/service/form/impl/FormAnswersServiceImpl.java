package com.questions_application.questions_application_0_0_1.service.form.impl;

import com.questions_application.questions_application_0_0_1.model.form.FormAnswers;
import com.questions_application.questions_application_0_0_1.repository.form.FormAnswersRepository;
import com.questions_application.questions_application_0_0_1.service.form.FormAnswersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormAnswersServiceImpl implements FormAnswersService {

    @Autowired
    FormAnswersRepository repository;

    @Override
    public void saveAnswers(List<FormAnswers> formAnswersList) {

        repository.saveAll(formAnswersList);
    }
}

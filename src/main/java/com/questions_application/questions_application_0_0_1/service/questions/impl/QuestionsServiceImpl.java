package com.questions_application.questions_application_0_0_1.service.questions.impl;

import com.questions_application.questions_application_0_0_1.model.questions.Questions;
import com.questions_application.questions_application_0_0_1.repository.questions.QuestionsRepository;
import com.questions_application.questions_application_0_0_1.service.questions.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionsServiceImpl implements QuestionsService {

    @Autowired
    QuestionsRepository questionsRepository;

    @Override
    public List<Questions> getAllQuestions() {
        return questionsRepository.findAll();
    }

    @Override
    public Questions getConditionalQuestions(Integer questionId) {
        return questionsRepository.findByParentId(questionId);
    }

    @Override
    public void saveAll(List<Questions> questionsList) {
        questionsRepository.saveAll(questionsList);
    }

}

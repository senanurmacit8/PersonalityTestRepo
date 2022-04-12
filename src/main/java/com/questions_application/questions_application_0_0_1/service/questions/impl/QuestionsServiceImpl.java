package com.questions_application.questions_application_0_0_1.service.questions.impl;

import com.questions_application.questions_application_0_0_1.model.questions.Quesitons;
import com.questions_application.questions_application_0_0_1.repository.questions.QuestionsRepository;
import com.questions_application.questions_application_0_0_1.service.dto.QuestionsDTO;
import com.questions_application.questions_application_0_0_1.service.questions.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionsServiceImpl implements QuestionsService {

    @Autowired
    QuestionsRepository questionsRepository;

    @Override
    public List<Quesitons> getAllQuestions() {
        return questionsRepository.findAll();
    }

    @Override
    public QuestionsDTO getConditionalQuestions(Long questionId) {
        QuestionsDTO questionsDTO = new QuestionsDTO();

       // questionsDTO =  questionsRepository.findByParentId(questionId);

        return questionsDTO;
    }

    @Override
    public void saveAll(List<QuestionsDTO> questionsDTOList) {

    }

}

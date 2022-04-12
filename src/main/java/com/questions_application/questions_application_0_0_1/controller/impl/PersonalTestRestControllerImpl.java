package com.questions_application.questions_application_0_0_1.controller.impl;

import com.questions_application.questions_application_0_0_1.controller.PersonalTestRestController;
import com.questions_application.questions_application_0_0_1.service.dto.QuestionsDTO;
import com.questions_application.questions_application_0_0_1.service.questions.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/main/0.1")
public class PersonalTestRestControllerImpl implements PersonalTestRestController {

    @Autowired
    QuestionsService questionsService;

    @Override
    @GetMapping("/getQuestions")
    public List<QuestionsDTO> getQuestions() {
        List<QuestionsDTO> questionsDTOList = null;
        //questionsDTOList = questionsService.getAllQuestions();
        return questionsDTOList;
    }

    @Override
    @GetMapping(value = "/getConditionalQuestions")
    public QuestionsDTO getConditionalQuestions(@RequestParam Long questionId) {
        QuestionsDTO questionsDTO = new QuestionsDTO();
        questionsDTO= questionsService.getConditionalQuestions(questionId);

        return questionsDTO;
    }

    @Override
    @PostMapping("/saveAllQuestions")
    public void saveAllQuestions(@RequestParam List<QuestionsDTO> questionsDTOList) {
        questionsService.saveAll(questionsDTOList);
    }

}

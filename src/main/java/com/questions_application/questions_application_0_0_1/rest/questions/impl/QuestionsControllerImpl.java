package com.questions_application.questions_application_0_0_1.rest.questions.impl;

import com.questions_application.questions_application_0_0_1.dto.QuestionsDTO;
import com.questions_application.questions_application_0_0_1.mapper.questions.QuestionsMapper;
import com.questions_application.questions_application_0_0_1.model.questions.Questions;
import com.questions_application.questions_application_0_0_1.rest.questions.QuestionsController;
import com.questions_application.questions_application_0_0_1.service.questions.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionsControllerImpl implements QuestionsController {


    @Autowired
    QuestionsService questionsService;

    @Autowired
    QuestionsMapper mapper;

    @Override
    @GetMapping("/getAllQuestionsByFormId")
    public List<QuestionsDTO> getAllQuestionsByFormId(@RequestParam Integer id ) {
        List<QuestionsDTO> questionsDTOList = null;

        List<Questions> response = questionsService.getAllQuestions();

        if(!CollectionUtils.isEmpty(response)){
            questionsDTOList = mapper.mapToQuestionDTOList(questionsService.getAllQuestions());
        }

        return questionsDTOList;
    }

    @Override
    @GetMapping(value = "/getConditionalQuestions")
    public QuestionsDTO getConditionalQuestions(@RequestParam Integer questionId) {
        QuestionsDTO questionsDTO = new QuestionsDTO();

        Questions response = questionsService.getConditionalQuestions(questionId);
        if (null!= response){
            questionsDTO = mapper.mapToQuestionsDTO(response);
        }

        return questionsDTO;
    }

    @Override
    @PostMapping("/saveAllQuestions")
    public void saveAllQuestions(@RequestParam List<QuestionsDTO> questionsDTOList) {
        questionsService.saveAll(mapper.mapToQuestionsList(questionsDTOList));
    }

}

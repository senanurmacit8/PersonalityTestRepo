package com.questions_application.questions_application_0_0_1.mapper.questions;

import com.questions_application.questions_application_0_0_1.model.questions.Questions;
import com.questions_application.questions_application_0_0_1.dto.QuestionsDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface QuestionsMapper {
QuestionsMapper INSTANCE = Mappers.getMapper(QuestionsMapper.class);

@Mapping(target = "question", source = "question")
QuestionsDTO mapToQuestionsDTO(Questions questions);

List<QuestionsDTO> mapToQuestionDTOList(List<Questions> questionsList);

List<Questions> mapToQuestionsList(List<QuestionsDTO> questionsDTOList);

Questions mapToQuestions(QuestionsDTO questionsDTO);

}

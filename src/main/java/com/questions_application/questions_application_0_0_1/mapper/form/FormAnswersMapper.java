package com.questions_application.questions_application_0_0_1.mapper.form;

import com.questions_application.questions_application_0_0_1.dto.FormAnswersDTO;
import com.questions_application.questions_application_0_0_1.model.form.FormAnswers;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FormAnswersMapper {
FormAnswersMapper INSTANCE = Mappers.getMapper(FormAnswersMapper.class);

FormAnswersDTO mapToDTO(FormAnswers formAnswers);

List<FormAnswersDTO> mapToDTOList(List<FormAnswers> formAnswersList);

List<FormAnswers> mapToList(List<FormAnswersDTO> formAnswersDTOList);

FormAnswers mapTo(FormAnswersDTO formAnswersDTO);

}

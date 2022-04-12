package com.questions_application.questions_application_0_0_1.mapper.categories;

import com.questions_application.questions_application_0_0_1.dto.CategoriesDTO;
import com.questions_application.questions_application_0_0_1.dto.QuestionsDTO;
import com.questions_application.questions_application_0_0_1.model.categories.Categories;
import com.questions_application.questions_application_0_0_1.model.questions.Questions;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoriesMapper {
CategoriesMapper INSTANCE = Mappers.getMapper(CategoriesMapper.class);

CategoriesDTO mapToCategoriesDTO(Categories categories);

List<CategoriesDTO> mapToCategoriesList(List<Categories> categoriesList);

}

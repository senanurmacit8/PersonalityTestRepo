package com.questions_application.questions_application_0_0_1.service.categories;

import com.questions_application.questions_application_0_0_1.model.categories.Categories;
import com.questions_application.questions_application_0_0_1.service.dto.CategoriesDTO;

import java.util.List;

public interface CategoriesService {

    List<Categories> getAllCategories();
}

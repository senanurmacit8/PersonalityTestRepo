package com.questions_application.questions_application_0_0_1.service.categories.impl;

import com.questions_application.questions_application_0_0_1.model.categories.Categories;
import com.questions_application.questions_application_0_0_1.repository.categories.CategoriesRepository;
import com.questions_application.questions_application_0_0_1.service.categories.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesServiceImpl implements CategoriesService {

    @Autowired
    CategoriesRepository categoriesRepository;

    @Override
    public List<Categories> getAllCategories() {
        return categoriesRepository.findAll();
    }
}

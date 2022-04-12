package com.questions_application.questions_application_0_0_1.repository.categories;

import com.questions_application.questions_application_0_0_1.model.categories.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriesRepository extends JpaRepository<Categories, Integer> {

}

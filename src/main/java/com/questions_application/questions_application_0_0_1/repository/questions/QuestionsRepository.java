package com.questions_application.questions_application_0_0_1.repository.questions;

import com.questions_application.questions_application_0_0_1.model.questions.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface QuestionsRepository extends JpaRepository<Questions, Integer> {

    Questions findByParentId(Integer parentId);

}

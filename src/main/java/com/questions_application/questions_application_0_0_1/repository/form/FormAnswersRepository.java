package com.questions_application.questions_application_0_0_1.repository.form;

import com.questions_application.questions_application_0_0_1.model.form.FormAnswers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FormAnswersRepository extends JpaRepository<FormAnswers, Integer> {

}

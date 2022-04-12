package com.questions_application.questions_application_0_0_1.repository.questions;

import com.questions_application.questions_application_0_0_1.model.questions.Quesitons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionsRepository extends JpaRepository<Quesitons, Long> {

    Quesitons findByParentId(Long id);

}

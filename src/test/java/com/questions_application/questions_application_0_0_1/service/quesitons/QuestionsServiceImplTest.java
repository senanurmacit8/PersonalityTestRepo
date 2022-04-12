package com.questions_application.questions_application_0_0_1.service.quesitons;

import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class QuestionsServiceImplTest {

    /*
    @Autowired
    private QuestionsRepository mockRepository;

    @Before("")
    public void init() {

        MockitoAnnotations.initMocks(this);
        mockRepository= Mockito.mock(QuestionsRepository.class);

    }

    @Test()
    public void testGetConditionalQuestions() {

        Questions questions = new Questions();
        questions.setId(4);
        questions.setParentId(3);
        questions.setQuestion("How should your potential partner respond to this question?");

        when(mockRepository.findByParentId(3)).thenReturn(questions);
    }


    @Test()
    public void testSaveAll() {

        Questions questions = Questions.builder()
                .id(4)
                .parentId(3)
                .question("How should your potential partner respond to this question?").build();

        mockRepository.save(questions);
        Assertions.assertThat(questions.getId()).isGreaterThan(0);
    }


     */
}

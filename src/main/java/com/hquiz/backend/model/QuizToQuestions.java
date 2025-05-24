package com.hquiz.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class QuizToQuestions {
    //Composite key (quiz_id & quiz_ques)

    //gets the quiz id from the Quiz Table
    @Column(name="quiz_id")
    private Long quiz_id;


    //has the question_id to access the question and the options
    @Column(name="quiz_ques")
    @Id
    private Long quiz_ques;
    
}

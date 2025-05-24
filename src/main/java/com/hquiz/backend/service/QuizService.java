package com.hquiz.backend.service;

import java.util.List;

import com.hquiz.backend.model.Quiz;

public interface QuizService {
    //To create the quiz
    String createQuiz(Quiz quiz);

    //To display the list of quizes
    List<Quiz> getQuizes();
}

package com.hquiz.backend.service;

import java.util.List;

import com.hquiz.backend.model.Questions;
import com.hquiz.backend.model.QuizToQuestions;

public interface QuizToQuestionsService {
    String createLinker(QuizToQuestions qtq);
    String createLinkers(List<QuizToQuestions> qtq);
    List<Questions> getQuestionsFromQuizId(Long quiz_id);
}

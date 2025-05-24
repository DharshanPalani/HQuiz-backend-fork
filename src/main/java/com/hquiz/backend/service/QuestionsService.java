package com.hquiz.backend.service;


import com.hquiz.backend.model.Questions;
// This is a interfact for the create question, interface.
public interface QuestionsService {
    String createQuestion(Questions question);
    Questions getQuestions(Long ques_id);
}

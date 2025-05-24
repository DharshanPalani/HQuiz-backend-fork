package com.hquiz.backend.service;

import org.springframework.stereotype.Service;

import com.hquiz.backend.model.Questions;
import com.hquiz.backend.repository.QuestionsRepository;

@Service
// This handles the storing the question to the database implimentation
public class QuestionsServiceImpl implements QuestionsService {

    private QuestionsRepository questionsRepository;

    @Override
    public String createQuestion(Questions question) {
        try {
            Questions saveQuestion = questionsRepository.save(question);
            return "Added Question" + saveQuestion.getId();
        } catch(Exception error) {
            throw new RuntimeException(error);
        }
    }
    
}

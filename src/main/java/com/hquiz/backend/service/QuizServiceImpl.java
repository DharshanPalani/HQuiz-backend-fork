package com.hquiz.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hquiz.backend.model.Quiz;
import com.hquiz.backend.repository.QuizRepository;

import jakarta.validation.Valid;
@Service
public class QuizServiceImpl implements QuizService{

    @Autowired
    QuizRepository quizRepository;

    @Override
    public String createQuiz(@Valid Quiz quiz) {
        if(quiz.getQuiz_title().isEmpty() || quiz.getQuiz_title().isBlank() || quiz.getUser_id()==null){
            return "Error:Cannot Create quiz";
        }
        Quiz savedQuiz = quizRepository.save(quiz);
        return savedQuiz.getQuiz_id().toString();
    }

    @Override
    public List<Quiz> getQuizes() {
        return quizRepository.findAll();
    }
    
}

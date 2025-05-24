package com.hquiz.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hquiz.backend.model.Quiz;
import com.hquiz.backend.service.QuizServiceImpl;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    @Autowired
    QuizServiceImpl quizService;

    @PostMapping("/create")
    public String createQuiz(@RequestBody Quiz quiz){
        return quizService.createQuiz(quiz);
    }

    @GetMapping("/get")
    public List<Quiz> getQuizes(){
        return quizService.getQuizes();
        }
}

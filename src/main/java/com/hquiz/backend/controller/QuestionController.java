package com.hquiz.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hquiz.backend.model.Questions;
import com.hquiz.backend.service.QuestionsServiceImpl;

@RestController
@RequestMapping("/questions")
// This handles the post api route, controller for the question.
// For now, it only handles creating shi
public class QuestionController {
    @Autowired
    QuestionsServiceImpl questionService;
    //To add one new Question
    @PostMapping("/new")
    public String createQuestion(@RequestBody Questions question) {
        return questionService.createQuestion(question);
    }

    //To add multiple new questions
    @PostMapping("/newmultiple")
    public String createQuestions(@RequestBody List<Questions> questions){
        return questionService.createQuestions(questions);
    }
}

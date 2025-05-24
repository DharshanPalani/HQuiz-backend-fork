package com.hquiz.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hquiz.backend.model.Questions;
import com.hquiz.backend.model.QuizToQuestions;
import com.hquiz.backend.service.QuizToQuestionsServiceImpl;

@RestController
@RequestMapping("/qtq")
public class QuizToQuestionsController {
    @Autowired
    QuizToQuestionsServiceImpl qtqService;

    @PostMapping("/create")
    public String createLinker(@RequestBody QuizToQuestions q){
        return qtqService.createLinker(q);
    }

    @PostMapping("/createMultiple")
    public String createLinkers(@RequestBody List<QuizToQuestions> q){
        return qtqService.createLinkers(q);
    }

    @GetMapping("/get/{id}")
    public List<Questions> getQuestions(@PathVariable("id") Long id){
        return qtqService.getQuestionsFromQuizId(id);
    }
}

package com.hquiz.backend.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hquiz.backend.model.Questions;
import com.hquiz.backend.repository.QuestionsRepository;

@Service
// This handles the storing the question to the database implimentation
public class QuestionsServiceImpl implements QuestionsService {
    @Autowired
    private QuestionsRepository questionsRepository;

    @Override
    public String createQuestion(Questions question) {
        try {
            Questions saveQuestion = questionsRepository.save(question);
            return  saveQuestion.getId().toString();
        } catch(Exception error) {
            throw new RuntimeException(error);
        }
    }

    @Override
    public Questions getQuestions(Long ques_id) {
        Optional<Questions> q =  questionsRepository.findById(ques_id);
        if(q.isPresent())
            return q.get();
        return null;
    }

    @Override
    public String createQuestions(List<Questions> questions) {
        List<String> list = new ArrayList<>();
        try{
        for(Questions q : questions){
           list.add(createQuestion(q));
        }}
        catch(Exception e){
            return e.getMessage();
        }
        return list.toString();
    }

    
    
}

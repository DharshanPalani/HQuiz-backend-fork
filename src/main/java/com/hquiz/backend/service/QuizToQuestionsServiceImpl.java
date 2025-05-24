package com.hquiz.backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hquiz.backend.model.Questions;
import com.hquiz.backend.model.QuizToQuestions;
import com.hquiz.backend.repository.QuizToQuestionsRepository;

@Service
public class QuizToQuestionsServiceImpl implements QuizToQuestionsService{
    //qtq=QuizToQuestions
    @Autowired
    QuestionsServiceImpl qService;

    @Autowired
    QuizToQuestionsRepository qtqRep;


    //creates a single linker
    @Override
    public String createLinker(QuizToQuestions qtq) {
        if(qtq.getQuiz_id()==null || qtq.getQuiz_ques()==null){
            return "Linker failed";
        }
         QuizToQuestions createdQTQ = qtqRep.save(qtq);
         return "Linked added"+createdQTQ;
    }

    //creates multiple linkers(Useful as the questions will get passed as list from the frontend)
    @Override
    public String createLinkers(List<QuizToQuestions> qtq) {
        if(qtq.isEmpty()){
            return "No linkers provided,Failed";
        }
        for(QuizToQuestions q : qtq){
            createLinker(q);
        }
        return "Added the linkers";
    }

    //Displays all the questions for the particular quiz id
    @Override
    public List<Questions> getQuestionsFromQuizId(Long quiz_id) {
        List<Long> questionIDs = new ArrayList<>();
        List<Questions> questions = new ArrayList<>();
        List<QuizToQuestions> quizToQuestions = qtqRep.findAll();
        for(QuizToQuestions q : quizToQuestions){
            if(q.getQuiz_id()==quiz_id) questionIDs.add(q.getQuiz_ques());
        }        
        for(Long q : questionIDs){
            questions.add(qService.getQuestions(q));
        }
        return questions;
    }
    
}

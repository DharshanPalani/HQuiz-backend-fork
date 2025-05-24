package com.hquiz.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hquiz.backend.model.QuizToQuestions;

@Repository
public interface QuizToQuestionsRepository extends JpaRepository<QuizToQuestions,Long>{
    
}

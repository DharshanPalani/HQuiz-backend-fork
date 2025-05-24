package com.hquiz.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hquiz.backend.model.Quiz;

@Repository
public interface QuizRepository extends JpaRepository<Quiz,Long> {
}

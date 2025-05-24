package com.hquiz.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hquiz.backend.model.Questions;

@Repository
// This is a way to connect to the postgress db, idk the rest
public interface QuestionsRepository extends JpaRepository<Questions, Long>{
    Optional<Questions> findByQuestionID(Long id);
}

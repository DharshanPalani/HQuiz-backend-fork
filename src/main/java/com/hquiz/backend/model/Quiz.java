package com.hquiz.backend.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

//It has the ahh like the.. information about the quiz,
//The quiz_to_questions will get the quiz id from here,so pretty important yea

@Entity
@Getter
@Setter
public class Quiz {
    //PRIMARY KEY
    @Column(name="quiz_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long quiz_id;

    @Column(name="quiz_title")
    private String quiz_title;


    //FOREIGN KEY
    @Column(name="user_id")
    private Long user_id;
}

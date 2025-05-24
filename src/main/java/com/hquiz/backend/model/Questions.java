package com.hquiz.backend.model;

import java.util.List;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
// This is the db entity. Like a template for storing questions
public class Questions {
    @Column(name="id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="question_title")
    @NotNull
    private String question_title;

    @Column(name="options")
    @NotNull
    private List<String> options;

    @Column(name="correct_option")
    @NotNull
    private String correct_option;
}

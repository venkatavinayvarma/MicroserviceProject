package com.vinay.quizapp.dao;

import com.vinay.quizapp.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface QuestionDao extends JpaRepository<Question, Integer> {


    // here we mention jpa to get list of questions from database by category
    List<Question> findByCategory(String category);

}

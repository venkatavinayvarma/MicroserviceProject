package com.vinay.quizapp.dao;

import com.vinay.quizapp.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface QuestionDao extends JpaRepository<Question, Integer> {

}

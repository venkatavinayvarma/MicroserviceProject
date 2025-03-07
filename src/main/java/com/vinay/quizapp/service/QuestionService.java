package com.vinay.quizapp.service;

import com.vinay.quizapp.Question;
import com.vinay.quizapp.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;

    // used to get all questions from the database
    public List<Question> getAllQuestions() {
        return questionDao.findAll();

    }
    // used to find all questions based on category
    public List<Question> getQuestionByCategory(String category) {
        return questionDao.findByCategory(category);
    }

    // here we are telling dao to add values to the database
    public String addQuestion(Question question) {
        questionDao.save(question);
        return "Question added successfully";
    }
}

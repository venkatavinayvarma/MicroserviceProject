package com.vinay.quizapp.controller;
import java.util.List;
import com.vinay.quizapp.model.Question;
import com.vinay.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;
    // here implemented get function so that it will get all the questions from database
    @GetMapping("allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions() {
        return questionService.getAllQuestions();  // here we are adding the https status code using response entity
    }

    // here implemented get function so that it will get all the questions based on category from database
    @GetMapping("category/{category}")
    public ResponseEntity<List<Question>> getQuestionByCategory(@PathVariable String category) {
        return questionService.getQuestionByCategory(category);

    }

    // here we are going to add values to the database
    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question) {
        return questionService.addQuestion(question);

    }



}

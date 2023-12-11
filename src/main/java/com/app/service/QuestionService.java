package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.QuestionDao;
import com.app.entity.Question;

@Service
public class QuestionService {

	@Autowired
	QuestionDao questionDao;

	public List<Question> getAllQuestions() {
		return questionDao.findAll();
	}

	public List<Question> getQuestionsByCategory(String category) {
		return questionDao.findByCategory(category);
	}

	public Question addQuestion(Question question) {
		return questionDao.save(question);
	}

	public Question updateQuestion(Question question) {
		return questionDao.save(question);
	}

	public Optional<Question> deleteQuestion(Integer id) {
		Optional<Question> ques = questionDao.findById(id);
		questionDao.deleteById(id);
		return ques;
	}

}

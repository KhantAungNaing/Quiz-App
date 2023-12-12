package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.entity.Question;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer>{

	List<Question> findByCategory(String category);

	@Query(value = "select * from question q where q.category=:category order by RANDOM() LIMIT :numOfQuestion", nativeQuery = true)
	List<Question> findRandomQuestionsByCategory(String category, int numOfQuestion);
	
}

package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Quiz;

public interface QuizDao extends JpaRepository<Quiz, Integer>{

}

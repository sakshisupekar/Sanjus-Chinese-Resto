package com.sanjus.chineseresto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanjus.chineseresto.model.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}
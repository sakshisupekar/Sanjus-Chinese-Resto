package com.sanjus.chineseresto.service;

import java.util.List;

import com.sanjus.chineseresto.model.Feedback;

public interface FeedbackService {

	Feedback saveFeedback(Feedback feedback);
    List<Feedback> getAllFeedback();
}

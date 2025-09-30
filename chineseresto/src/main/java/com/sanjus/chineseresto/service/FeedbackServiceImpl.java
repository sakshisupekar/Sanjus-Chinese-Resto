package com.sanjus.chineseresto.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sanjus.chineseresto.model.Feedback;
import com.sanjus.chineseresto.repository.FeedbackRepository;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    private final FeedbackRepository feedbackRepository;

    public FeedbackServiceImpl(FeedbackRepository feedbackRepository) {
        this.feedbackRepository = feedbackRepository;
    }

    @Override
    public Feedback saveFeedback(Feedback feedback) {
        return feedbackRepository.save(feedback);
    }

    @Override
    public List<Feedback> getAllFeedback() {
        return feedbackRepository.findAll();
    }
}
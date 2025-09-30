package com.sanjus.chineseresto.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanjus.chineseresto.model.Feedback;
import com.sanjus.chineseresto.service.FeedbackService;

@RestController
@RequestMapping("/sanjuschineseresto/feedback")
@CrossOrigin(origins="http://localhost:4200")


public class FeedbackController {

	private final FeedbackService feedbackService;

    public FeedbackController(FeedbackService feedbackService) {
        this.feedbackService = feedbackService;
    }

    // Save Feedback
    @PostMapping
    public Feedback saveFeedback(@RequestBody Feedback feedback) {
        return feedbackService.saveFeedback(feedback);
    }

    // Get All Feedback
    @GetMapping
    public List<Feedback> getAllFeedback() {
        return feedbackService.getAllFeedback();
    }
}

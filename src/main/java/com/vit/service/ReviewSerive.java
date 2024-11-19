package com.vit.service;

import java.util.List;

import com.vit.Exception.ReviewException;
import com.vit.model.Review;
import com.vit.model.User;
import com.vit.request.ReviewRequest;

public interface ReviewSerive {
	
    public Review submitReview(ReviewRequest review,User user);
    public void deleteReview(Long reviewId) throws ReviewException;
    public double calculateAverageRating(List<Review> reviews);
}

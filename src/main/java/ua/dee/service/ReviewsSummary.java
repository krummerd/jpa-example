package ua.dee.service;


import ua.dee.model.Rating;

public interface ReviewsSummary {

    long getNumberOfReviewsWithRating(Rating rating);

}
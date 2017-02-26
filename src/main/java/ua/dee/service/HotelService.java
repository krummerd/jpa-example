package ua.dee.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ua.dee.model.City;
import ua.dee.model.Hotel;
import ua.dee.model.Review;
import ua.dee.model.ReviewDetails;

public interface HotelService {

    Hotel getHotel(City city, String name);

    Page<Review> getReviews(Hotel hotel, Pageable pageable);

    Review getReview(Hotel hotel, int index);

    Review addReview(Hotel hotel, ReviewDetails details);

    ReviewsSummary getReviewSummary(Hotel hotel);

}
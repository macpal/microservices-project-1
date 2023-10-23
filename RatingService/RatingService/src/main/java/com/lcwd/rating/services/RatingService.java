package com.lcwd.rating.services;

import com.lcwd.rating.entities.Rating;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RatingService {

    //create
    Rating createRating(Rating rating);
    //get all ratings
    List<Rating> getRatings();
    //get all by user id
    List<Rating> getRatingByUserId(String userId);
    //get all by hotel
    List<Rating> getRatingByHotelId(String hotelId);


}

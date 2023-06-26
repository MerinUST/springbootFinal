package com.example.demo.service;

import com.example.demo.dto.RatingResponseDto;
//import com.example.demo.dto.RatingDto;
import com.example.demo.entity.Rating;
import com.example.demo.repository.RatingRepository;

//import com.example.demo.repository.RatingRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RatingService {

    private final RatingRepository ratingRepository;

    public RatingService(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }

    public Rating saveRating(RatingResponseDto ratingDto) {
        Rating rating = mapDtoToEntity(ratingDto);
        return ratingRepository.save(rating);
    }

    public Optional<Rating> findRatingById(long id) {
        return ratingRepository.findById(id);
    }

    public double calculateAverageRatingByIsbn(long isbn) {
        List<Rating> ratings = ratingRepository.findAllByIsbn(isbn);
        int sum = 0;
        for (Rating rating : ratings) {
            sum += rating.getRating();
        }
        return ratings.isEmpty() ? 0 : (double) sum / ratings.size();
    }

    private Rating mapDtoToEntity(RatingResponseDto ratingDto) {
        Rating rating = new Rating();
        rating.setUsername(ratingDto.getUsername());
        rating.setId(ratingDto.getId());
        rating.setIsbn(ratingDto.getIsbn());
        rating.setRating(ratingDto.getRating());
        rating.setComment(ratingDto.getComment());
        rating.setRatingid(ratingDto.getRatingid());
        return rating;
    }
}

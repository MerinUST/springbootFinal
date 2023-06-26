//package com.example.demo.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.dto.postReviewDto;
//import com.example.demo.service.ratingService;
//
//@RestController
//@CrossOrigin("*")
//
//public class controller {
//	@Autowired
//	ratingService ratingservice;
//	@PostMapping()
//	public ResponseEntity<?> rating(@RequestBody postReviewDto reviewdto) {
//		
//	    
//}
//}
//package com.example.demo.controller;
//
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.dto.RatingResponseDto;
//import com.example.demo.service.RatingService;
//
//@RestController
//@RequestMapping("/ratings")
//public class RatingController {
//
//    private final RatingService ratingService;
//
//    public RatingController(RatingService ratingService) {
//        this.ratingService = ratingService;
//    }
//
//    @PostMapping
//    public ResponseEntity<RatingResponseDto> rateTheBook(@RequestBody PostReviewDto postReviewDto) {
//        RatingController rating = ratingService.rateTheBook(postReviewDto);
//        RatingResponseDto responseDto = ratingService.mapToResponseDto(rating);
//        return ResponseEntity.status(HttpStatus.CREATED).body(responseDto);
//    }
//}



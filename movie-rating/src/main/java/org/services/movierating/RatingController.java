package org.services.movierating;

import org.services.movierating.model.MovieInfo;
import org.services.movierating.model.MovieRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rating")
public class RatingController {

    private static int rating_count=0;
    @Autowired
    private RestTemplate restTemplate;

    @Value("${movie_info_service_endpoint}")
    private String movie_info_service_endpoint;

    @RequestMapping("/{movieName}")
    public MovieRating getRatingForMovie(@PathVariable("movieName")String movieName){

        MovieInfo movie = restTemplate.getForObject(movie_info_service_endpoint+"/"+movieName
                ,MovieInfo.class);

        return new MovieRating(++rating_count,movie,MovieStar.FOUR_STAR);
    }
}

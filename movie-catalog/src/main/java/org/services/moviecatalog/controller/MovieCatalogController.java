package org.services.moviecatalog.controller;


import org.services.moviecatalog.MovieStar;
import org.services.moviecatalog.modle.CatalogItem;
import org.services.moviecatalog.modle.MovieInfo;
import org.services.moviecatalog.modle.MovieRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {

    @Autowired
    @Qualifier("BasicRestTemplate")
    private RestTemplate restTemplate;

    @Autowired
    @Qualifier("EurekaRestTemplate")
    private RestTemplate eurekaRestTemplate;

    @Value("${movie_info_service_endpoint}")
    private String movie_info_service_endpoint;

    @Value("${movie_rating_service_endpoint}")
    private String movie_rating_service_endpoint;

    @Value("${movie_info_service_eureka_endpoint}")
    private String movie_info_service_eureka_endpoint;

    @Value("${movie_rating_service_eureka_endpoint}")
    private String movie_rating_service_eureka_endpoint;

    @RequestMapping("/{movieName}")
    public CatalogItem getMovieCatalogById(@PathVariable("movieName") String movieName){
/*
        //***** Directly connecting to services

        MovieInfo movie = restTemplate.getForObject(movie_info_service_endpoint+"/"+movieName
                ,MovieInfo.class);

        MovieRating rating = restTemplate.getForObject(movie_rating_service_endpoint+"/"+movieName
                ,MovieRating.class);*/


        // ***** Connecting to services via Eureka Server

        MovieInfo movie = eurekaRestTemplate.getForObject(movie_info_service_eureka_endpoint+"/"+movieName
                ,MovieInfo.class);

        MovieRating rating = eurekaRestTemplate.getForObject(movie_rating_service_eureka_endpoint+"/"+movieName
                ,MovieRating.class);

        return new CatalogItem(1,movie,rating);
    }
}

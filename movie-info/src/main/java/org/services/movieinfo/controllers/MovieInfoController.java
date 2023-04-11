package org.services.movieinfo.controllers;

import org.services.movieinfo.model.MovieInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieInfoController {

    private static int movieCount=0;
    @RequestMapping("/{name}")
    private MovieInfo getMovieInfo(@PathVariable("name")String name){
        return new MovieInfo(++movieCount,name);
    }
}

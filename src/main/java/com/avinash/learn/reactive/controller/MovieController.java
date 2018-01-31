package com.avinash.learn.reactive.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avinash.learn.reactive.model.Movie;
import com.avinash.learn.reactive.model.MovieEvent;
import com.avinash.learn.reactive.service.MovieService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.awt.*;

/**
 * Created by jt on 10/11/17.
 */
@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping(value = "/{id}/events", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    Flux<MovieEvent> streamMovieEvents(@PathVariable String id){
        return movieService.events(id);
    }

    @GetMapping(value = "/{id}")
    Mono<Movie> getMovieById(@PathVariable String id){
        return movieService.getMovieById(id);
    }

    @GetMapping
    Flux<Movie> getAllMovies(){
        return movieService.getAllMovies();
    }
}
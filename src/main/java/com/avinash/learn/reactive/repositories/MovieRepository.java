package com.avinash.learn.reactive.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.avinash.learn.reactive.model.Movie;


public interface MovieRepository extends ReactiveMongoRepository<Movie, String> {
}
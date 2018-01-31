package com.avinash.learn.reactive.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor
@RequiredArgsConstructor //@AllArgsConstructor
public class Movie {

    private String id;

    @NonNull
    private String title;

}
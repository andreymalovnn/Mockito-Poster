package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor

public class MovieItem {
    private int movieId;
    private String movieName;
    private String movieGenre;
    private String moviePicture;
}


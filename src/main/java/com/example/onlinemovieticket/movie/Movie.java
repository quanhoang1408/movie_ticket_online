package com.example.onlinemovieticket.movie;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movieID;

    public Movie() {
    }

    public Movie(String title, String description, Integer duration, String genre, Date releaseDate) {
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.genre = genre;
        this.releaseDate = releaseDate;
    }

    @Column(nullable = false)
    private String title;
    private String description;
    private Integer duration;
    private String genre;
    private Date releaseDate;

    public Long getMovieID() {
        return movieID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}


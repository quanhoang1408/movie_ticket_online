package com.example.onlinemovieticket.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

        @Autowired
        private final MovieRepository movieRepository;

        public MovieService(MovieRepository movieRepository) {
            this.movieRepository = movieRepository;
        }

        public Movie save(Movie movie) {
            return movieRepository.save(movie);
        }

        public Movie findById(Long id) {
            return movieRepository.findById(id).orElse(null);
        }

        public List<Movie> findAll() {
            return movieRepository.findAll();
        }

        public void deleteById(Long id) {
            movieRepository.deleteById(id);
        }

        public Movie update(Movie movie) {
            return movieRepository.save(movie);
        }
}

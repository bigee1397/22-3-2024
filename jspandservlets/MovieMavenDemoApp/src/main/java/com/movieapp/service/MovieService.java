package com.movieapp.service;

import java.util.List;

public class MovieService {
	public List<String> showLanguageMovies(String language) throws Exception {
		List<String> movies = MovieDetails.showMovieDetails(language);
		if(movies.isEmpty()) throw new Exception("Movies with this language not found");
		return movies;
	}
}

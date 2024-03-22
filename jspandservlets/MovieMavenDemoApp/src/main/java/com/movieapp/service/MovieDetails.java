package com.movieapp.service;

import java.util.Arrays;
import java.util.List;

public class MovieDetails {
	public static List<String> showMovieDetails(String language) {
		
		if(language.equalsIgnoreCase("hollywood")) return Arrays.asList("Up","Avataar","Avataar: The Way of Water", "Uncharted");
		else if(language.equalsIgnoreCase("bollywood")) return Arrays.asList("Chennai Express", "Ra-One", "Zindagi Na Milegi Dobara");
		else if(language.equalsIgnoreCase("tollywood")) return Arrays.asList("Mr.Perfect", "Darling", "Bahubali", "Varsham");
		else if(language.equalsIgnoreCase("sandalwood")) return Arrays.asList("KGF - 1", "KGFG - 2", "Mr. & Mrs. Ramachari", "Googly");

		return null;
	}
}

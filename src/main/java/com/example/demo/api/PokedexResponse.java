package com.example.demo.api;

import java.util.List;

public class PokedexResponse {
    private List<Pokemon> results;

	public List<Pokemon> getResults() {
		return results;
	}

	public void setResults(List<Pokemon> results) {
		this.results = results;
	}

    
}
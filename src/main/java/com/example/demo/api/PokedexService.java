package com.example.demo.api;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokedexService {

    private final RestTemplate restTemplate;

    public PokedexService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public PokedexResponse getPokemons() {
        String url = "https://pokeapi.co/api/v2/pokemon"; // URL de la API de Pokedex
        return restTemplate.getForObject(url, PokedexResponse.class);
    }

}

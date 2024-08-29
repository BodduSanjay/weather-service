package com.example.weather_service.service;

import com.example.weather_service.model.WeatherData;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    private final String API_KEY = "303b8d049dfe1bd5351f851f924f09a7";
    private final String BASE_URL = "http://api.weatherstack.com/current?access_key=" + API_KEY + "&query=";

    public WeatherData getWeather(String city) {
        String url = BASE_URL + city;
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, WeatherData.class);
    }
}

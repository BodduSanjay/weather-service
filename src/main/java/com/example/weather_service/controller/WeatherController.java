package com.example.weather_service.controller;

import com.example.weather_service.model.WeatherData;
import com.example.weather_service.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather")
    public String getWeather(Model model, @RequestParam String city) {
        WeatherData weatherData = weatherService.getWeather(city);
        model.addAttribute("weather", weatherData);
        return "weather";
    }
}

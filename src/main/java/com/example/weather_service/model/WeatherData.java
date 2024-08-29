package com.example.weather_service.model;

import lombok.Data;

import java.util.List;

@Data
public class WeatherData {
    private Location location;
    private Current current;

    @Data
    public static class Location {
        private String name;
        private String country;
    }

    @Data
    public static class Current {
        private String temperature;
        private List<String> weather_descriptions;
    }
}

package com.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.weather.entity.WeatherInfo;
import com.weather.service.WeatherInfoService;

import java.util.List;

@RestController
@RequestMapping("/api/weather")
public class WeatherInfoController {

    @Autowired
    private WeatherInfoService service;

    @PostMapping("/add")
    public ResponseEntity<WeatherInfo> addWeather(@RequestBody WeatherInfo weatherInfo) {
        return new ResponseEntity<>(service.addWeatherInfo(weatherInfo), HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<WeatherInfo>> getAllWeather() {
        return ResponseEntity.ok(service.getAllWeatherInfo());
    }

    @GetMapping("/city/{city}")
    public ResponseEntity<List<WeatherInfo>> getByCity(@PathVariable String city) {
        return ResponseEntity.ok(service.getWeatherByCity(city));
    }

    @GetMapping("/state/{state}")
    public ResponseEntity<List<WeatherInfo>> getByState(@PathVariable String state) {
        return ResponseEntity.ok(service.getWeatherByState(state));
    }
}
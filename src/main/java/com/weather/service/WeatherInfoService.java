package com.weather.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weather.entity.WeatherInfo;
import com.weather.repository.WeatherInfoRepository;

import java.util.List;

@Service
public class WeatherInfoService {

    @Autowired
    private WeatherInfoRepository repository;

    public WeatherInfo addWeatherInfo(WeatherInfo weatherInfo) {
        return repository.save(weatherInfo);
    }

    public List<WeatherInfo> getAllWeatherInfo() {
        return repository.findAll();
    }

    public List<WeatherInfo> getWeatherByCity(String city) {
        return repository.findByCity(city);
    }

    public List<WeatherInfo> getWeatherByState(String state) {
        return repository.findByState(state);
    }
}

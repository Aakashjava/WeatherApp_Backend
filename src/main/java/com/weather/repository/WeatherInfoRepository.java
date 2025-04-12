package com.weather.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.weather.entity.WeatherInfo;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface WeatherInfoRepository extends JpaRepository<WeatherInfo, Long> {
    List<WeatherInfo> findByCity(String city);
    List<WeatherInfo> findByState(String state);
    List<WeatherInfo> findByDate(LocalDate date);
    List<WeatherInfo> findByCityAndDate(String city, LocalDate date);
}
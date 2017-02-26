package ua.dee.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ua.dee.model.City;
import ua.dee.model.HotelSummary;

public interface CityService {

    Page<City> findCities(CitySearchCriteria criteria, Pageable pageable);

    City getCity(String name, String country);

    Page<HotelSummary> getHotels(City city, Pageable pageable);

}
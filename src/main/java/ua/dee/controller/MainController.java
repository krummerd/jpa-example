package ua.dee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ua.dee.service.CityService;

@Controller
public class MainController {

    @Autowired
    private CityService cityService;

    public String helloWorld() {
        return this.cityService.getCity("Bath", "UK").getName();
    }
}

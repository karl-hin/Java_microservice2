package com.test3.microcommerce2.controller;

import com.test3.microcommerce2.model.Car;
import com.test3.microcommerce2.service.ServiceGetApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController2 {

    @Autowired
    private ServiceGetApi serviceGetApi;

    //api/carsList
    @RequestMapping(value = {"api/carsList"}, method = RequestMethod.GET)
    public String CarsList() {
        return serviceGetApi.getApiCarList();
    }

    //api/Car/{id}
    @GetMapping(value = "api/car/{id}")
    public String showACar(@PathVariable int id) {
        return serviceGetApi.getApiCarId(id);
    }

    @PostMapping(value = "api/carsList/addNewCar")
    public String addNewCar(@RequestBody Car car) {
        return serviceGetApi.addApiCar(car);
    }
}


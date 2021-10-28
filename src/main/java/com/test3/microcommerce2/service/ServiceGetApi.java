package com.test3.microcommerce2.service;

import com.test3.microcommerce2.model.Car;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ServiceGetApi {

    public String getApiCarList() {
        String url = "http://localhost:8081/api/carsList";
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);
        System.out.println("response :" + response);
        return response;
    }

    public String getApiCarId(int id) {
        String url = "http://localhost:8081/api/car/" + id;
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);
        System.out.println("response :" + response);
        return response;
    }

    public String addApiCar(Car car) {
        String url = "http://localhost:8081/api/carsList/addNewCar";
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);
        System.out.println("response :" + response);
        return response;
    }

}

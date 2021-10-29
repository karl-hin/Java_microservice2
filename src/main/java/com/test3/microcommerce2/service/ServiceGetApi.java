package com.test3.microcommerce2.service;

import com.test3.microcommerce2.model.Car;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ServiceGetApi {

    RestTemplate restTemplate = new RestTemplate();

    public String getApiCarList() {
        String url = "http://localhost:8081/api/carsList";
        String response = restTemplate.getForObject(url, String.class);
        System.out.println("response :" + response);
        return response;
    }

    public String getApiCarId(int id) {
        String url = "http://localhost:8081/api/car/" + id;
        String response = restTemplate.getForObject(url, String.class);
        System.out.println("response :" + response);
        return response;
    }

    public Car addApiCar(Car car) {
        String url = "http://localhost:8081/api/carsList/addNewCar";
        ResponseEntity<Void> response = restTemplate.postForEntity(url, car, Void.class);
        System.out.println("response :" + response);
        System.out.println("tab :" + getApiCarList());
        return car;
    }

    public Car update(int id, Car car) {
        String url = "http://localhost:8081/api/car/" + id;
        restTemplate.put (url, car);
        System.out.println("tab :" + getApiCarList());
        return car;
    }

    public Car deleteCarApi(int id) {
        String url = "http://localhost:8081/api/car/" + id;
        restTemplate.delete(url);
        System.out.println("tab :" + getApiCarList());
        return null;
    }

}

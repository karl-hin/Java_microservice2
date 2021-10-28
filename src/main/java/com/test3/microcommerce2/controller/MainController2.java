package com.test3.microcommerce2.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainController2 {

    @RequestMapping(value = {"api/carsList"}, method = RequestMethod.GET)
    public String getApiCarList() {
        String url = "http://localhost:8081/api/carsList";
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);
        System.out.println("response :" + response);
        return response;
    }
}


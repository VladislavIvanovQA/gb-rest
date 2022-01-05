package ru.gb.gbrest.service.resttemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import ru.gb.gbrest.entity.Order;

import java.util.Collections;

@Component
public class OrderDtoApiV2 {
    private static final String URL = "http://localhost:8465/order";
    private final RestTemplate restTemplate;

    @Autowired
    public OrderDtoApiV2(RestTemplateBuilder restTemplateBuilder) {
        restTemplate = restTemplateBuilder.build();
    }

    public Order addProduct(Long id) {
        return restTemplate.getForObject(URL + "/add?id={id}", Order.class, id);
    }

    public Order deleteById(Long id) {
        return restTemplate.getForObject(URL + "/delete?id={id}", Order.class, id);
    }
}

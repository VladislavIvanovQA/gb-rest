package ru.gb.gbrest.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url = "localhost:8465/order", value = "orderDtoApi")
public interface OrderDtoApi {
    @GetMapping(value = "/add")
    void addProduct(@RequestParam(name = "id") Long id);

    @GetMapping(value = "/delete")
    void deleteById(@RequestParam(name = "id") Long id);
}

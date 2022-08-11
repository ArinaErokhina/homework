package com.homework.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.Set;


@RestController
@RequestMapping(path = "/order")
public class BasketController {

    @Autowired
    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }


    @GetMapping(path = "/add")
    public String addBasket(@RequestParam("id") List<Integer> idItem) {
        for (int i = 0; i < idItem.size(); i++) {
            basketService.addBasket(idItem);
        }
        return "Товар успешно добавлен.";
    }

    @GetMapping(path = "/get")
    public Set getItem() {
        return basketService.getItem();
    }

}
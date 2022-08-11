package com.homework.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class BasketServiceImpl implements BasketService {

    @Autowired
    private final Basket basket;

    public BasketServiceImpl(Basket basket) {
        this.basket = basket;
    }

    public String addBasket(List<Integer> ids) {
        basket.setItem(ids);
        return "Товар был успешно добавлен.";
    }

    public Set getItem() {
        return basket.getItem();
    }
}
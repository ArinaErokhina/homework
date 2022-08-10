package com.homework.homework;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;
import java.util.Set;

@Service
@SessionScope
public class BasketServiceImpl implements BasketService {

    private Basket basket = new Basket();

    public String addBasket(List<Integer> ids) {
        basket.setItem(ids);
        return "Товар был успешно добавлен.";
    }

    public Set getItem() {
        return basket.getItem();
    }
}
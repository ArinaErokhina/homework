package com.homework.homework;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
@SessionScope
public class Basket {
    final Set<Integer> item = new HashSet<>();


    public Set getItem() {
        return this.item;
    }

    public void setItem(List<Integer> item) {
        for (int i = 0; i < item.size(); i++) {
            this.item.add(item.get(i));
        }
    }
}
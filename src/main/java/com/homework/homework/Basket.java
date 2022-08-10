package com.homework.homework;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Basket {
    private Set<Integer> item = new HashSet<>();


    public Set getItem() {
        return this.item;
    }

    public void setItem(List<Integer> item) {
        for (int i = 0; i < item.size(); i++) {
            this.item.add(item.get(i));
        }
    }
}
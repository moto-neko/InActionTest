package com.example.sort;

import java.util.ArrayList;
import java.util.List;

import com.example.dto.Apple;
import com.example.predicate.ApplePredicate;

public class InventoryFilter {
    public static List<Apple> filterApples(List<Apple> apples, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : apples) {
            if (p.test(apple))
                result.add(apple);
        }
        return result;
    }
}

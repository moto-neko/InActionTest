package com.example;

import java.util.ArrayList;
import java.util.List;

import com.example.dto.Apple;
import com.example.format.AppleFullPrettyPrint;
import com.example.format.ApplePrettyPrint;
import com.example.format.AppleShortPrettyPrint;
import com.example.predicate.AppleGreenColorPredicate;
import com.example.property.Color;
import com.example.util.InventoryFilter;


public class App {
    static List<Apple> apples = new ArrayList<>();

    public static void main(String[] args) {
        apples.add(new Apple(Color.BLUE, 100));
        apples.add(new Apple(Color.GREEN, 160));
        apples.add(new Apple(Color.GREEN, 100));
        apples.add(new Apple(Color.GREEN, 90));
        apples.add(new Apple(Color.RED, 160));
        apples.add(new Apple(Color.RED, 100));

        List<Apple> result = InventoryFilter.filterApples(apples, new AppleGreenColorPredicate());
        ApplePrettyPrint applePrint = new AppleShortPrettyPrint();
        for (Apple apple : result) {
            //System.out.println(apple.toString());
            applePrint.prettyPrint(apple);
        }

    }
}

package com.example.format;

import com.example.dto.Apple;

public class AppleShortPrettyPrint implements ApplePrettyPrint<Apple> {
    @Override
    public void prettyPrint(Apple apple) {
        System.out.println("Apple "+apple.getColor().name().charAt(0)+apple.getColor().name().substring(1).toLowerCase());
    }

}

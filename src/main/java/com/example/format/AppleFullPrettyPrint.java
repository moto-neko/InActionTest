package com.example.format;

import com.example.dto.Apple;

public class AppleFullPrettyPrint implements ApplePrettyPrint<Apple> {
    @Override
    public void prettyPrint(Apple apple) {
        System.out.println("Apple Color: "+apple.getColor().name()+"; Weight: "+apple.getWeight());
    }

}

package com.example.predicate;

import com.example.dto.Apple;
import com.example.property.Color;

public class AppleGreenColorPredicate implements ApplePredicate {

    public boolean test(Apple apple) {
        return Color.GREEN.equals(apple.getColor());
    }
}

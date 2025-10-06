package com.example.util;

import java.util.List;

import com.example.dto.Apple;
import com.example.format.ApplePrettyPrint;

public class InventoryPrettyPrint {

    static void print(List<Apple> apples, ApplePrettyPrint app) {
        for (Apple apple : apples) {
            app.prettyPrint(apple);
        }
    }
    
} 

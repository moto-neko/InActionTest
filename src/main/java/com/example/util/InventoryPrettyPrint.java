package com.example.util;

import java.util.List;

import com.example.dto.Apple;
import com.example.format.ApplePrettyPrint;

public class InventoryPrettyPrint {

    static <T> void print(List<T> apples, ApplePrettyPrint<T> app) {
        for (T apple : apples) {
            app.prettyPrint(apple);
        }
    }
    
} 

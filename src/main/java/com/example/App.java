package com.example;

import java.util.Arrays;
import java.util.List;

import com.example.dto.Apple;
import com.example.format.ApplePrettyPrint;
import com.example.format.AppleShortPrettyPrint;
import com.example.predicate.AppleGreenColorPredicate;
import com.example.property.Color;
import com.example.util.InventoryFilter;

public class App {

    public static void main(String[] args) {
        List<Apple> apples = createInventory();
        printFilteredApples(apples);
    }

    private static List<Apple> createInventory() {
        return Arrays.asList(
            new Apple(Color.BLUE, 100),
            new Apple(Color.GREEN, 160),
            new Apple(Color.GREEN, 100),
            new Apple(Color.GREEN, 90),
            new Apple(Color.RED, 160),
            new Apple(Color.RED, 100)
        );
    }

    private static void printFilteredApples(List<Apple> apples) {
        List<Apple> filteredApples = InventoryFilter.filterApples(apples, new AppleGreenColorPredicate());
        ApplePrettyPrint printer = new AppleShortPrettyPrint();
        
        filteredApples.forEach(printer::prettyPrint);
    }
}

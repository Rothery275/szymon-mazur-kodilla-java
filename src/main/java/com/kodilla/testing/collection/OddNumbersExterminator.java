package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public  ArrayList <Integer> exterminate (ArrayList <Integer> numbers) {
        ArrayList <Integer> evenNumbers = new ArrayList<>();

        for (int index = 0; index <numbers.size(); index++) {

            if (numbers.get(index) % 2 == 0) {
                evenNumbers.add(numbers.get(index));
            }
        }
        return evenNumbers;
    }
}
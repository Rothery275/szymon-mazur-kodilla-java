package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    public static void main(String[] args) {

        OddNumbersExterminator x = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(0,3);
        numbers.add(1,5);
        numbers.add(2,4);
        numbers.add(3,10);
        numbers.add(4,15);
        numbers.add(5,20);

        System.out.println(x.exterminate(numbers));
    }

    public  ArrayList <Integer> exterminate (ArrayList <Integer> numbers) {
        ArrayList <Integer> evenNumbers = new ArrayList<Integer>();

        for (int index = 0; index <numbers.size(); index++) {

            if (numbers.get(index) % 2 == 0) {
                evenNumbers.add(numbers.get(index));
            }
        }
        return evenNumbers;
    }

}


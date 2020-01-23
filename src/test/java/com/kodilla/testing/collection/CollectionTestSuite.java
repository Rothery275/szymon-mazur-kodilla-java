package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;


public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test start");
    }

    @After
    public void after() {
        System.out.println("Test end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> emptyList = new ArrayList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> testList = exterminator.exterminate(emptyList);
        //Then
        Assert.assertEquals(emptyList, testList);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(0, 3);
        numbers.add(1, 5);
        numbers.add(2, 4);
        numbers.add(3, 10);
        numbers.add(4, 15);
        numbers.add(5, 20);
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> actualList = new ArrayList<>();
        actualList.add(4);
        actualList.add(10);
        actualList.add(20);
        //When
        ArrayList<Integer> testList = exterminator.exterminate(numbers);
        //Then
        Assert.assertEquals(actualList, testList);
    }
}
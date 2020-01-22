package com.kodilla.testing.collection;

import net.minidev.json.JSONUtil;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

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
        //When
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        System.out.println(exterminator.exterminate(emptyList));
        //Then
        Assert.assertEquals(emptyList, exterminator.exterminate(emptyList));
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(0,3);
        numbers.add(1,5);
        numbers.add(2,4);
        numbers.add(3,10);
        numbers.add(4,15);
        numbers.add(5,20);
        //When
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> actualList = new ArrayList<>();
        actualList.add(4);
        actualList.add(10);
        actualList.add(20);
        System.out.println(exterminator.exterminate(numbers));
        //Then
        Assert.assertEquals(actualList, exterminator.exterminate(numbers));
    }
}

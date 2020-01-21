package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        //next test
        Calculator calculator = new Calculator(158.35, 74.00);
        double addingResult = calculator.addAToB(158.35, 74.00);
        double subtractingResult = calculator.subtractAFromB(158.35, 74.00);
        double testAdd = calculator.getA() + calculator.getB();
        double testSubtract = calculator.getA() - calculator.getB();

        if(addingResult == testAdd) {
            System.out.println("Success! Result equals: " + addingResult);
        } else {
            System.out.println("Error of adding!");
        }

        if(subtractingResult == testSubtract) {
            System.out.println("Success! Result equals: " + subtractingResult);
        } else {
            System.out.println("Error of subtracting!");
        }
    }
}

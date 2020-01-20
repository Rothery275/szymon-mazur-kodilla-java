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
        Calculator calculator = new Calculator();
        double addingResult = calculator.addAToB(19.51, 56.86);
        double subtractingResult = calculator.subtractAFromB(754.49,157.12);

        if(addingResult == 19.51 + 56.86) {
            System.out.println("Success! Result equals: " + addingResult);
        } else {
            System.out.println("Error of adding!");
        }

        if(subtractingResult == 754.49 - 157.12) {
            System.out.println("Success! Result equals: " + subtractingResult);
        } else {
            System.out.println("Error of subtracting!");
        }
    }
}

package com.kodilla.testing.calculator;

import com.kodilla.testing.TestingMain;

public class Calculator {
    double a;
    double b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double getA() {
        return this.a;
    }
    public double getB() {
        return this.b;
    }
    public double addAToB(double a, double b) {
        return a + b;
    }
    public double subtractAFromB( double a, double b) {
        return a - b;
    }
}

package com.example.SystemDesign.DecoraterPattern;

public class BasePIzza implements Pizza{
    @Override
    public String getDescription() {
        return "Pizza : Base Pizza";
    }

    @Override
    public double getCost() {
        return 100;
    }
}

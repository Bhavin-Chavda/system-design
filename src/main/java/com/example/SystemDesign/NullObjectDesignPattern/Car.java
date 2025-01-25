package com.example.SystemDesign.NullObjectDesignPattern;

public class Car implements Vehicle{
    @Override
    public int getSeatCapacity() {
        return 5;
    }

    @Override
    public int getTankCapacity() {
        return 40;
    }
}

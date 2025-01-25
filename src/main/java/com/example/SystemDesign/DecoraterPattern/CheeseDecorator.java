package com.example.SystemDesign.DecoraterPattern;

public class CheeseDecorator extends PizzaDecorator{
    public CheeseDecorator(Pizza pizaa) {
        super(pizaa);
    }

    @Override
    public double getCost() {
        return super.getCost()+20;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" , Cheese Added";
    }
}

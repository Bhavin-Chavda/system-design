package com.example.SystemDesign.DecoraterPattern;

public class PepperoniDecorator extends PizzaDecorator{
    public PepperoniDecorator(Pizza pizaa) {
        super(pizaa);
    }

    @Override
    public double getCost() {
        return super.getCost() + 30;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " , Pepperoni Added";
    }
}

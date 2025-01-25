package com.example.SystemDesign.DecoraterPattern;

public class OlivesDecorator extends PizzaDecorator{
    public OlivesDecorator(Pizza pizaa) {
        super(pizaa);
    }

    @Override
    public double getCost() {
        return super.getCost() + 40;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " , Olives Added";
    }
}

package com.example.SystemDesign.DecoraterPattern;

abstract class PizzaDecorator implements Pizza{

    protected Pizza pizza;

    public PizzaDecorator(Pizza pizaa)
    {
        this.pizza = pizaa;
    }

    @Override
    public double getCost()
    {
        return pizza.getCost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }
}

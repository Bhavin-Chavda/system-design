package com.example.SystemDesign.DecoraterPattern;

public class PizzaCostIdentifier {
    public static void main(String[] args) {

        Pizza basePIzza = new BasePIzza();
        System.out.println(basePIzza.getDescription()+ " - $"+basePIzza.getCost());

        Pizza cheesePizza = new CheeseDecorator(basePIzza);
        System.out.println(cheesePizza.getDescription() + " - $" + cheesePizza.getCost());

        Pizza pepperoniCheesePizza = new PepperoniDecorator(cheesePizza);
        System.out.println(pepperoniCheesePizza.getDescription() + " - $" + pepperoniCheesePizza.getCost());

        Pizza deluxePizza = new OlivesDecorator(pepperoniCheesePizza);
        System.out.println(deluxePizza.getDescription() + " - $" + deluxePizza.getCost());



    }
}

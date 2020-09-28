package org.example;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;


public class App {

    public static void main(String[] args) {
//        App app = new App();
//        System.out.println(app.calculator("25cm + 20dm -300mm + 1km", "dm"));

    }
    public double calculator(String expression, String resultUnit) {
        System.out.println("The result will be printed in " + resultUnit);
        Expression e = new ExpressionBuilder(expression) // I imported a dependency that knows to evaluate an expression like this.
                .variables("mm", "cm", "m", "dm", "km")
                .build()
                .setVariable("mm", 1)
                .setVariable("cm", 10) //Expressing every unit in mm
                .setVariable("dm", 100) //in mm
                .setVariable("m", 1000) //in mm
                .setVariable("km", 1000000); //in mm
        double result = e.evaluate();
        switch (resultUnit.toLowerCase().trim()) {
            case "mm":
                return (result);
            case "cm":
                return (result / 10);
            case "dm":
                return (result / 100);
            case "m":
                return (result / 1000);
            case "km":
                return (result / 1000000);
            default:
                System.out.println("Enter valid system");
                return (-1);
        }
    }
}

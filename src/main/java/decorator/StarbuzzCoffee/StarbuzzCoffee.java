package decorator.StarbuzzCoffee;

import decorator.StarbuzzCoffee.Beverages.DarkRoast;
import decorator.StarbuzzCoffee.Beverages.Espresso;
import decorator.StarbuzzCoffee.Beverages.HouseBlend;
import decorator.StarbuzzCoffee.Condiments.Mocha;
import decorator.StarbuzzCoffee.Condiments.Soy;
import decorator.StarbuzzCoffee.Condiments.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());

    }
}

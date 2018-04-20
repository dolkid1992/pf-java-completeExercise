package Eden;

import OOP.App;

public class World {
    public static void main(String[] args) {
        System.out.println("<====== Eden ======>  ");
        System.out.println("Adam was born");
        Human adam = new Human();
        System.out.println("Eva was born");
        Human eva = new Human();

        God god = new God();
        god.say("You can not eat Apple, you will die if you eat Apple");

        Snake snake = new Snake();
        snake.say("Eat Apple Please! It's verry deliciou, You will not die");

        Apple apple = new Apple(5);
        while (!apple.isEmpty()){
            System.out.print("Adam eat Apple");
            adam.eat(apple);
            System.out.println("Eva eat Apple");
            eva.eat(apple);
        }

        System.out.print("Until the Apple is gone");
        System.out.println("\n Adam and Eve sleep");
        adam.sleep();
        eva.sleep();
        god.say("Eva! You will have to obey your husband and have pain when giving birth");
        god.say("You will have to plant a tree to eat");
        System.out.println("The End");
    }
}

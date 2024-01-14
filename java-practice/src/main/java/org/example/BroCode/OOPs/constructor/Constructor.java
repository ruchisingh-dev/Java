package org.example.BroCode.OOPs.constructor;

public class Constructor {
    public static void main(String[] args) {
        // constructor = special method that is called when an object is instantiated (created)
        Human human = new Human("ruchi", 19, 60);
        Human human2 = new Human("shikha", 19, 57);
        System.out.println(human2.name);
        System.out.println(human.name);
        human2.eat();
        human.drink();
    }

}

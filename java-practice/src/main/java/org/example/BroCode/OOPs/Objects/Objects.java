package org.example.BroCode.OOPs.Objects;

public class Objects {
    public static void main(String[] args) {
        // objects: an instance os a class that may contain attributes and methods.
        // example: (phone, desk, computer, coffee cup)

        Car myCar1 = new Car();
        Car myCar2 = new Car();
        System.out.println(myCar1.color);
        System.out.println(myCar2.model);
        myCar1.drive();
        myCar2.brake();
    }
}


// Super calls the constructor of the class that this class is inheriting from (the animal class)
// the functions move and eat from the animal class are usable by the dog class.
// we know that all dogs have a brain and a body so we initialize the class with 1 instead of having the programmer who
// is creating the dog class define those.
/*
* now both the dog class has its own eat method, and also the animal class has its own eat method.
* The process of a dog eating food is chewing, so we call the method chew which is unique to the dog class.
* then we use super.eat() what super means is call the super equivalent of that class.
* the super class for this current class is animal, so Java looks at animal and calls the animal version of the eat
* method.
*
* The ability of a subclass to override a method allows a class to inherit from a superclass whose behavior is
* "close enough" and then to modify behavior as needed.
*
* Instead of super.move(); we used move(); because if you later want to override the animal move method for the dog
 * class, (i.e., something unique to the dog class for moving) it will ensure that the one in the dog class is executed
 * since it is in the same file (the override we created), rather than the move() method in the animal class.
* */

package com.kennethnicholas;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {

        super(name, 1, 1, size, weight);

        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;

    }

    private void chew() {

        System.out.println("Dog.chew() called");

    }

    @Override
    public void eat() {

        System.out.println("Dog.eat() called");

        chew();

        super.eat();

    }

    public void walk() {

        System.out.println("Dog.walk() called");

        move(5);

    }

    public void run() {

        System.out.println("Dog.run() called");

        move(10);

    }

    private void moveLegs(int speed) {

        System.out.println("Dog.moveLegs() called");

    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);

    }
}

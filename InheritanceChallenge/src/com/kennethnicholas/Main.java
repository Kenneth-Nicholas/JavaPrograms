/* Reference vs Object vs Instance vs Class Notes
*
*
*
* Each time you create an object from a class you've written, you're creating an instance of that object / class.
*
* public class Main {
*
*   public static void main(String[] args) {
*       House blueHouse = new House("blue");
*       House anotherHouse = blueHouse;
*
*       System.out.println(blueHouse.getColor()); // blue
*       System.out.println(anotherHouse.getColor()); // blue
*
*       anotherHouse.setColor("yellow");
*       System.out.println(blueHouse.getColor()); // yellow
*       System.out.println(anotherHouse.getColor()); // yellow
*
*       House greenHouse = new House("green");
*       anotherHouse = greenHouse; // now anotherHouse references greenHouse instead of blueHouse.
*       // anotherHouse is now green, so is green house, but blueHouse is still yellow.
*       // because when anotherHouse was a reference to blueHouse, it was changed to yellow.
*       // anotherHouse was a reference to the memory location where blueHouse is stored, so changing anotherHouse
*       // actually changed the data that was stored at the memory location where blueHouse's data is stored.
*       // likewise, changing anotherHouse to reference greenHouse instead of referencing blueHouse made anotherHouse a
*       // reference to the data in the memory location where the data for greenHouse is stored.
*       // changing anotherHouse to reference greenHouse instead of referencing blueHouse did not change the data stored
*       // for the blueHouse object, blueHouse is still yellow, anotherHouse is green, and greenHouse is green.
*       // anotherHouse is dereferenced, and now points to greenHouse instead of blueHouse.
*
*       System.out.println(blueHouse.getColor()); // yellow
*       System.out.println(anotherHouse.getColor()); // green
*       System.out.println(greenHouse.getColor()); // green
*   }
* }
*
* In Java, you always have references to an object in memory, there is no way to access an object directly,
* everything is done using a reference.
*
*
*
* This vs Super Notes
*
*
*
* super is used to access / call the parent class members (variables and methods).
*
* this is used to access / call the current class members (variables and methods).
* this is required when we have a parameter with the same name as an instance variable (field).
*
* Note: we can use both of them anywhere in a class except static areas (the static block or a static method).
* Any attempt to do so will lead to compile-time errors (more on static later in the course).
*
* Keyword this is commonly used in constructors and setters, and optionally in getters.
*
* Keyword super is commonly used in method overwriting. Calls the method with the same name from the parent class.
*
* use this() to call a constructor from another overloaded constructor in the same class.
* (Must be the first statement in each constructor)
*
* the only way to call a parent constructor is to use super() (must be the first statement in each constructor.)
*
* Note: A constructor can have a call to super() or this() but never both.
*
* Constructor chaining. - one constructor does all the work. Best way to do constructors. Reduces duplicated code.
*
*
*
* Method Overloading vs Overriding Recap Notes
*
*
*
* Method overloading means providing two or more separate methods in a class with the same name but different parameters.
* Method return type may or may not be different and that allows us to reuse the same method name.
* Overloading is very handy, it reduces duplicated code and we don't have to remember multiple method names.
*
* Overloading doesn't have anything to do with polymorphism but Java developers often refer to overloading as Compile
* Time polymorphism. In other words, the compiler decided which method is going to be called based on the method name,
* return type and argument list. We can overload static and instance methods (more about the difference between static
* and instance methods later in the course).
*
* Usually overloading happens inside a single class, but a method can also be treated as overloaded in the subclass of
* that class. That is because a subclass inherits one version of the method from the parent class and then the subclass
* can have another overloaded version of the method.
*
* Method overloading rules
* Methods will be considered overloaded if both follow the following rules
* Methods must have the same method name.
* Methods must have different parameters.
*
* If methods follow the rules above then they may or may not
* Have different return types.
* Have different access modifiers.
* Throw different checked or unchecked exceptions (more on exceptions later in the course).
*
* Method Overriding
* Method overriding means defining a method in a child class that already exists in the parent class with the same
* signature (same name, same arguments).
* By extending the parent class the child class gets all the methods defined in the parent class (those methods are also
* known as derived methods).
* Method overriding is also known as Runtime Polymorphism and Dynamic Method Dispatch, because the method that is going
* to be called is decided at runtime by the JVM.
*
* When we override a method, it's recommended to put @Override immediately above the method definition. This is an
* annotation that the compiler reads and will then show us an error if we don't follow overriding rules correctly.
* We can't override static methods, only instance methods can be overridden.
*
* Method Overriding Rules
* Method will be considered overridden if we follow these rules
* It must have the same name and same arguments.
* Return type can be a subclass of the return type in the parent class.
* It can't have a lower access modifier.
* For example if the parent method is protected then using private in the child is not allowed but using public in the
* child would be allowed.
*
* There are also some important points about method overriding to keep in mind.
* Only inherited methods can be overridden, in other words methods can be overridden only in child classes.
* Constructors and private methods cannot be overridden.
* Methods that are final cannot be overridden.
* A subclass can use super.methodName() to call the superclass version of an overridden method.
*
*
*
* Static vs Instance Methods Notes
*
*
*
* Static methods are declared using a static modifier.
* Static methods can't access instance methods and instance variables directly.
* They are usually used for operations that don't require any data from an instance of the class (from 'this').
* If you remember, the this keyword is the current instance of a class.
*
* In static methods we can't use the this keyword.
* Whenever you see a method that does not use instance variables that method should be declared as a static method.
* For example main is a static method and it is called by the JVM when it starts an application.
*
* Instance Methods
* Instance methods belong to an instance of a class.
* To use an instance method we have to instantiate the class first usually by using the new keyword.
*
* Instance methods can access instance methods and instance variables directly.
* Instance methods can also access static methods and static variables directly.
*
* Should a method be static?
* Does it use any fields (instance variables) or instance methods?
* If yes, it should probably be an instance method.
* If no, it should probably be a static method.
*
*
*
* Static vs Instance Variables Notes
*
*
*
* Static Variables
* Declared by using the keyword static.
* Static variables are also known as static member variables.
* Every instance of that class shares the same static variable.
* If changes are made to that variable, all other instances will see the effect of the change.
*
* Static variables are not used very often but sometimes be very useful.
* For example when reading user input using Scanner we will declare scanner as a static variable.
* That way static methods can access it directly.
*
* class Dog {
*
*   private static String name;
*
*   public Dog(String name) {
*       Dog.name = name;
*   }
*
*   public void printName() {
*       System.out.println("name= " + name);
*   }
* }
*
* public class Main {
*
*   public static void main(String[] args) {
*       Dog rex = new Dog("rex"); // create instance (rex)
*       Dog fluffy = new Dog("fluffy"); // create instance (fluffy)
*       rex.printName(); // prints fluffy
*       fluffy.printName(); // prints fluffy
*   }
* }
*
* The output of both of these printName instance method calls is fluffy because name is a static variable.
* When Dog rex = new Dog("rex"); is executed, the static variable name is rex.
* When Dog fluffy = new Dog("fluffy"); is executed, the static variable name becomes fluffy.
* This causes both the name stored in the instance of the Dog object with the name rex to change to fluffy, and the name
* stored in the instance of the Dog object with the name fluffy to be initialized as fluffy.
*
* Instance Variables
* They don't use the static keyword.
* Instance variables are also known as fields or member variables.
* Instance variables belong to an instance variable of a class.
*
* Every instance has it's own copy of an instance variable.
* Every instance can have a different value (state).
* Instance variables represent the state of an instance.
*
* An example would be the same code as above, only in this case, it would be "private String name" without the static
* keyword. When this simple change is made, the output becomes rex followed by fluffy.
*
* */

package com.kennethnicholas;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

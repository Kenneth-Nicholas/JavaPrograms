// public keyword is an access modifier - means unrestricted access to a class.
// could be private - no other classes can access that class.
// protected - allows packages to access your class.
// removing access modifier makes it the default, which is public.
// member variables - variables usable anywhere inside the class, also referred to as fields.
// private encapsulates data, hides fields and methods from public access.
// internal workings of the object can only be accessed by the class/object itself, not things outside the class/object
// itself.
// generally, you will always go with private data types in a class.
// because a String is a class, you have a class within the class.
// putting validation in the class - you can't create an invalid car class.

package com.kennethnicholas;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {

        String validModel = model.toLowerCase();

        if(validModel.equals("carrera") || validModel.equals("commodore")) {

            this.model = model;

        } else {

            this.model = "Unknown";

        }

    }

    public String getModel() {

        return this.model;

    }

}

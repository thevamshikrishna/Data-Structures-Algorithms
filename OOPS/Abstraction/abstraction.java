/*Classes: 
 * A class is a blueprint or prototype for creating objects. 
 * It defines a set of attributes (data) and methods (functions) that the objects created from the class can use.

Objects: An object is an instance of a class. 
It encapsulates data and behavior related to a specific entity. 
Each object can have its own unique state but shares the structure and behavior defined by its class.

*
*
*
*Abstraction: Abstraction focuses on hiding the complex implementation
* details and showing only the necessary features of an object. 
*This simplifies interaction with objects by exposing only what is needed for the task at hand.
*/






package Abstraction;

// Interface defining the Shape behavior
interface Shape {
    double calculateArea();
}

// Class representing a Circle
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Class representing a Rectangle
class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Main class to test the Shape interface and its implementations
public class abstraction{
    public static void main(String[] args) {
        Shape circle = new Circle(5); // Creating a circle with radius 5
        Shape rectangle = new Rectangle(4, 6); // Creating a rectangle with length 4 and width 6

        // Calculating and printing areas
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}


package lab10;

abstract class Shape {
 public abstract double calculateArea();
}
class Rectangle extends Shape {
 private double length;
 private double width;

 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }
 public double calculateArea() {
     return length * width;
 }
}
class Circle extends Shape {
 private double radius;
 public Circle(double radius) {
     this.radius = radius;
 }
 public double calculateArea() {
     return Math.PI * radius * radius;
 }
}
public class ClassDemo {
 public static void main(String[] args) {
     Rectangle rectangle = new Rectangle(5, 3);
     Circle circle = new Circle(7);
     System.out.println("Area of Rectangle: " + rectangle.calculateArea());
     System.out.println("Area of Circle: " + circle.calculateArea());
 }
}
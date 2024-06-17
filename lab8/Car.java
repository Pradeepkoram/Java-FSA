package lab8;

class Vehicle {
    String brand;
    String model;
    int year;

    // Constructor
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void drive() {
        System.out.println("Driving the " + year + " " + brand + " " + model);
    }
}


class Car extends Vehicle {
    String color;

    // Constructor
    public Car(String brand, String model, int year, String color) {
        super(brand, model, year);
        this.color = color;
    }

    
    public void honk() {
        System.out.println("Honking the " + color + " car");
    }


    public static void main(String[] args) {
       
        Car myCar = new Car("Toyota", "Camry", 2020, "Red");
        myCar.drive(); 
        myCar.honk(); 
    }
    }






package com.company;

public class Car extends Vehicle {
    private String make;
    private String model;
    private int speed;

    public Car() {

    }

    public Car(String make) {
        this.make = make;
    }

    //getter and setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getSpeed() {
        return speed;
    }

    //methods
    public String starting() {
        return "The " + getColor() + " " + getMake() + " is starting.";
    }

    public String accelerate() {
        return "The " + getColor() + " " + getMake() + " is accelerating.";
    }

    public String stopped() {
        return "The " + getColor() + " " + getMake() + " is stopped.";
    }

    public String setSpeed(int speed) {
        this.speed = speed;
        return "The " + getColor() + " " + getMake() + " is going " + speed + " mph";
    }

    public String emissionChecked(){
        return "The "+ getColor() + " " + getMake() + " has stopped to have its emissions checked";
    }

    public String passedEmissionTest(){
        return "The "+ getColor() + " " + getMake() + " passes its emission test";
    }

    public String passed(Car car1, Car car2){
        return "The " + car1.getColor() + " " + car1.getMake() +" just passed the " +
                        car2.getColor() + " " + car2.getMake();
    }

    public String getDescription(){
        return "Car : " + getColor() + " " + getMake() + " " + getModel() + " ";

    }
}

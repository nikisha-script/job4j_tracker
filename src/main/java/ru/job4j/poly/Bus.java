package ru.job4j.poly;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " moving on fast lanes");
    }

    @Override
    public void vehicle() {
        System.out.println("It is " + getClass().getSimpleName());
    }

}

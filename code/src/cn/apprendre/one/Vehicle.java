package cn.apprendre.one;

import java.sql.DriverManager;

/**
 * @author JayHoo
 */
public abstract class Vehicle {

    protected abstract void drive();

    private static class Car extends Vehicle {
        @Override
        protected void drive() {
            System.out.println("on the road");
        }
    }

    private static class Plane extends Vehicle {

        @Override
        protected void drive() {
            System.out.println("fly in the sky");
        }
    }

    public static Vehicle getACar() {
        return new Car();
    }

    public static Vehicle getAPlane() {
        DriverManager
        return new Plane();
    }

    public static void main(String[] args) {
        Vehicle car = Vehicle.getACar();
        Vehicle plane = Vehicle.getAPlane();
        car.drive();
        plane.drive();
    }
}

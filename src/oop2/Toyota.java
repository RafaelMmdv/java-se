package oop2;

public class Toyota extends Car {

    //Burada Car super klassdir, Toyota drive klassdir.

    String tPackage;

    @Override
    void start() {
        System.out.println("Toyota Starting");
    }

    @Override
    void stop() {
        System.out.println("Toyota Stoping");
    }
}

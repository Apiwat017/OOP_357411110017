package oop_lab9;

import oop_lab8.Pet;

public class Cow extends Pet {

    public Cow(String name, int age) {
        super(name, age);
    }

    public void makeNoise() {
        System.out.println("More More !!!");
    }
}

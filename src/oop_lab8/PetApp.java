package oop_lab8;

import oop_lab9.Cow;

public class PetApp {
    public static void main(String[] args) {
        Dog dog = new Dog("Chayen",2,"Bangkeaw");
        System.out.println(dog.toString());
        dog.makeNoise();
        dog.myPet();

        cat cat = new cat("Giant",2,"Persian");
        System.out.println(cat.toString());
        cat.makeNoise();
        cat.myPet();

        Cow cow = new Cow("Nmajai",5);
        System.out.println(cow.toString());
        cow.makeNoise();
        cow.myPet();
    }//main
}//class

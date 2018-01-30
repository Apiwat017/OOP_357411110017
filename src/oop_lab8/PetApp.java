package oop_lab8;

public class PetApp {
    public static void main(String[] args) {
        Dog dog = new Dog("Chayen",2,"Bangkeaw");
        System.out.println(dog.toString());
        dog.makeNoise();

        cat cat = new cat("Giant",2,"Persian");
        System.out.println(cat.toString());
        cat.makeNoise();
    }
}

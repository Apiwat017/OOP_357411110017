package oop_lab8;

public class Dog extends Pet{
    private String breed;

    public Dog(String name, int age,String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }

    public void makeNoise() {
        System.out.println("Bahuuw");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

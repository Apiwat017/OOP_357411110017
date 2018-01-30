package oop_lab8;

public class cat extends Pet {
    private String breed;

    public cat(String name, int age,String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "cat{" +
                "breed='" + breed + '\'' +
                '}';
    }

    public void makeNoise() {
        System.out.println("Meaw");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}


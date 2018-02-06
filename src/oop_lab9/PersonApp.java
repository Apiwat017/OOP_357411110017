package oop_lab9;

public class PersonApp {
    public static void main(String[] args) {
        Address address = new Address("12/22","Nakhonsithammarat","80110");
        Job job = new Job("police",20000);
        Person person = new Person("357411110017","Apiwat",address,job);

        System.out.println(person.toString());
    }
}//class

package oop_lab3;

public class TestCondition {
    public static void main(String[] args) {
        //IF
        int x = 10, y = 20;
        if (x > y || x + 15 > y)
            System.out.println("x more than y");
        System.out.println("OOP");
//              if-else
        if (x > y) {
            System.out.println("x more than y");
        } else {
            System.out.println("x less than y");
        }

//          if-else-if
        if (x < 10) {
            System.out.println("x less than 10");
        } else if (x > 10) {
            System.out.println("x more than 10");
        } else {
            System.out.println("x is 10");
        }

    }//main
}// class

package oop_lab3;

public class TestForLoop {
    public static void main(String[] args) {

//        for (int i=1;i<=10;i++)
//            System.out.println("Hello.");
//
//        for (int i=1;i<10;i++)
//            System.out.println(i);

        for (int i=1;i<=100;i++)
            System.out.print(i+" ");

        for (int i=1;i<=100;i++){
            if (i%2==0)
                System.out.println(i+" ");
        }

        for (int i=1;i<=100;i++){
            if (i%3==0 && i%5==0)
                System.out.println(i+" ");
        }

    }//main
}//class

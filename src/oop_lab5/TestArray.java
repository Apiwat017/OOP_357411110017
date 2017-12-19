package oop_lab5;

public class TestArray {
    public static void main(String[] args) {
        int []number;
        number = new int[5];
        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);
        System.out.println(number[3]);
        System.out.println(number[4]);
        number[3] = 100;
        number[1] = 50;
        number[2] = number[1] + number[3];
        number[2+2] = number[1] * 3;
//        System.out.println(number[0]);
//        System.out.println(number[1]);
//        System.out.println(number[2]);
//        System.out.println(number[3]);
//        System.out.println(number[4]);
//        int[] num = new int[10];
//        for
        System.out.print("Data in array: ");
        for (int i=0;i<number.length;i++){
            System.out.println("number["+i+"]:"+number[i]+" ");
        }//for
        for (int val: number){
            System.out.print(val+ " ");
        }
//        int num[] = new int[500];
    }//main
}//class

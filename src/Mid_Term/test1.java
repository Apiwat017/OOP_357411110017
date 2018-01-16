package Mid_Term;

import java.util.Scanner;

public class test1 {

    public static final int x = 2561;

    public static void main(String[] args) {
        int count = 0;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.print("กรุณาใส่ปี พ.ศ. เกิดของคุณ: ");
            int y = scanner.nextInt();
            System.out.println("อายุของคุณคือ: " + (x - y));
        {
            count++;
            if (count==3){
                System.out.println("Thank you" );
                break;
            }
        }
    }while (count <=3);
}
}
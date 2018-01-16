package Mid_Term;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        String getName;
        int getID;
        int getSalary = 0;
        int net = 0;
        int salarynet = 0;
        int getTime = 0;
        Scanner oj = new Scanner(System.in);
        System.out.print("\nรหัสพนักงาน : ");
        getID = oj.nextInt();

        Scanner Keyboard = new Scanner(System.in);
        System.out.print("\nชื่อพนักงาน : ");
        getName = Keyboard.nextLine();

        System.out.print("\nเงินเดือนพนักงาน : ");
        getSalary = oj.nextInt();

        System.out.print("\nค่าล่วงเวลา : ");
        getTime = oj.nextInt();

        if (getSalary < 30000)
        {
            net = (getSalary * 1) / 100;
            salarynet=(getSalary+net);
            System.out.println("\nเสียภาษี : 1% ");
            System.out.println("\nภาษีที่เสีย :" + net);
            int getSalry;
            System.out.println("\nเงินเดือนสุทธิ :" +getTime);
            System.out.println("");
        }
        else if (getSalary <= 30000)
        {
            net = (getSalary * 3) / 100;
            salarynet = (getSalary + net);
            System.out.println("\nเสียภาษี : 3% ");
            System.out.println("\nภาษีที่เสีย :" + net);
            System.out.println("\nงินเดือนสุทธิ : " + salarynet);
        }
        else if (getSalary <= 50000)
        {
            net = (getSalary * 5) / 100;
            salarynet = (getSalary + net);
            System.out.println("\nเสียภาษี : 5% ");
            System.out.println("\nภาษีที่เสีย :" + net);
            System.out.println("\nงินเดือนสุทธิ : " + salarynet);
        }
        else if (getSalary <= 70000)
        {
            net = (getSalary * 7) / 100;
            salarynet = (getSalary + net);
            System.out.println("\nเสียภาษี : 7% ");
            System.out.println("\nภาษีที่เสีย :" + net);
            System.out.println("\nงินเดือนสุทธิ : " + salarynet);
        }
        else if (getSalary >= 100000)
        {
            net = (getSalary * 10) / 100;
            salarynet = (getSalary + net);
            System.out.println("\nเสียภาษี : 10% ");
            System.out.println("\nภาษีที่เสีย :" + net);
            System.out.println("\nงินเดือนสุทธิ : " + salarynet);
        }

    }
}

package oop_lab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudenData {
    public static BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
    public static String getName() throws IOException{
        System.out.print("Enter your name: ");
        return reader.readLine();
    }//getName
    public static String getAddress() throws IOException {
        System.out.print("Enter your address : ");
        return reader.readLine();
    }
    public static String getStdID() throws IOException {
        System.out.print("Enter you ID: ");
        return reader.readLine();
    }
    public static String getFaculty() throws IOException {
        System.out.print("Enter your major and faculty: ");
        return reader.readLine();
    }
    public static String getEmail() throws IOException {
        System.out.print("Enter your email: ");
        return reader.readLine();
    }
    public static void main(String[] args) throws IOException {
        String name = getName();
        String address = getAddress();
        String id = getStdID();
        String Fac = getFaculty();
        String email = getEmail();
        System.out.println(name+"\n"+address+"\n"+id+"\n"+Fac+"\n"+email);
        System.out.println(getName()+"\n"+getAddress());
    }
}//class

package oop_lab6;

import java.util.StringTokenizer;

public class StringToken {
    public static void main(String[] args) {

        String msg = "Hello, RMUTSV Apiwat kaewsrinaul";
        StringTokenizer myToken = new StringTokenizer(msg);
        System.out.println(myToken.countTokens());

        while (myToken.hasMoreTokens()){
            StringBuffer myBuf = new StringBuffer(
                    myToken.nextToken());
            System.out.print(myBuf.reverse()+" ");
        }//While

    }//main
}//class

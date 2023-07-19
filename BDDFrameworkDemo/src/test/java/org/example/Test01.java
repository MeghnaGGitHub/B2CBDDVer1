package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class Test01 {
    String str ="I love my country";
    String k= "I my love country";

   // String :-

//    String original_str = "MADAm";
//    StringBuilder sb = new StringBuilder(original_str);
//    String revrese_str=sb.reverse().toString();
//
//        if(original_str.equals(revrese_str)){
//        System.out.println("is Pallondrom" );
//    } else {
//        System.out.println("No");
//    }
    public static void main(String[] args) {


////
//        String original_str = "MADA m";
//        StringBuilder sb = new StringBuilder(original_str);
//        String revrese_str=sb.reverse().toString();
//
//        if(original_str.equals(revrese_str)){
//            System.out.println("is Pallondrom" );
//        } else {
//            System.out.println("No");
//        }

            String str = "satish";
            char [] charArray = str.toCharArray();
            System.out.println(charArray.length);

            String ss="";
        for(int i = charArray.length-1 ; i >=0; i--)
        {
           ss=ss+charArray[i];
        }
        System.out.println("Revrese "+ ss);
    }
}

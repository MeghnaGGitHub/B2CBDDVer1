package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Child extends Parent{
    public void sum(int a,int b){
        System.out.println(a*b);
    }
    public static void main(String[] args) {
        Parent p=new Parent();
        p.sum(1,2);
        //3

        Child c=new Child();
        c.sum(1,2);
        //2

        Parent p2 = new Child();
        Child c3 = (Child) p2;
        c3.sum(3,4);
        //12

        Parent pc=new Child();  //run-time
        pc.sum(1,5);
        //5



    }
}

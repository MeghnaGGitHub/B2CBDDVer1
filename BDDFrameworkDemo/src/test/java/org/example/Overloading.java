package org.example;
import org.junit.Assert;
//compiler
public class Overloading {
//    public void sum(int a,int b){
//        System.out.println(a+b);
//    }
//    public void sum(String a,String b ){
//        System.out.println(a+b);
//    }
//    public static void main(String[] args) {
//        Overloading obj = new Overloading();
//    }
//    //find missing number in a2
//    //add a1 num1+num2+num3+num4+num5=15;
//    //add a2 num1+num2+num3+num4=12;
//    //15-12=3;
//    int sum;
//    // overriding,project summary doc,project framework doc,end-to-end,create good 2+yr exp resume for manual+automation
//    //check overriding concept,map,modify something in project.
//    //study framework completely,find missing num in 2nd array prgm
//    //enable cucumber report search from net
public void add(int a,int b,int c){
    System.out.println(a+b);
}
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public  void add(double a,double b){
        System.out.println(a+b);
    }
    public  void add(double a,double b,double c){
        System.out.println(a+b+c);
    }
    public void add(int a,double b,double c){
        System.out.println(a+b+c);
    }
    public void add(double a,int b,double c){
        System.out.println(a+b+c);
    }
    public void add(double d,int e,double f,int g){
        System.out.println(d+e+f);
    }
    public static void main(String[] args) {
        Overloading obj=new Overloading();
          obj.add(3.5,5,3.5);
//        obj.add(4.5,4.5);
//        obj.add(2,3);//
//        obj.add(8,9,2);//
//        obj.add(5,5.0+7.5);
    }
}

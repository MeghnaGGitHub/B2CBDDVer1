package org.example;

import java.util.Arrays;

/*---Write a program to calculate the sum of all elements in an integer array---*/
public class WAPSumOfEleInArray1 {
    public static void main(String[] args) {
        int[] array_a = {89, 90, 78, 75, 76};
        int[] array_b = {75, 90, 76};

        Arrays.sort(array_a);
        Arrays.sort(array_b);
        System.out.println(array_a);

        for(int i :array_a) {
            for (int k : array_b) {

                if(i==k){
                }else{
                    System.out.println("Missing--- > "+k );
                }
            }
        }


       // Arrays.asList(array_a).stream().forEach(x-> System.out.println(x));
//
//        int sum_a = 0,sum_b=0;
//        for(int i:array_a){
//            sum_a+=i;
//        }
//        System.out.println(sum_a);
//        for(int i:array_b){
//            sum_b+=i;
//        }
//        System.out.println(sum_b);
//        int r=sum_a-sum_b;
//        System.out.println("Missing num is:"+r);
//    }
    }
}
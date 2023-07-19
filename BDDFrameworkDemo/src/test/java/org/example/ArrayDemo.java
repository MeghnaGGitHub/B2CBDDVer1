package org.example;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] a1={1,2,3,4,5};//15
        int[] a2={1,2,4,5};//12
        int[] arr;
        int sum1= 0,sum2=0;
        for(int i=0;i<a1.length;i++)
        {
            //System.out.println(a1[i]);
            sum1+=a1[i];

        }
        for (int i=0;i< a2.length;i++)
        {
            sum2+=a2[i];
        }
        System.out.println("Addition of 1st array:\t"+sum1);
        System.out.println("Addition of 2nd array:\t"+sum2);
        if (sum1>sum2){
            int temp=sum1-sum2;
            System.out.println("Missing number in 2nd array is:\t"+temp);
        }
        else
        {
            int temp=sum2-sum1;
            System.out.println("Missing number in 2nd array is:\t"+temp);
        }

    }
}
//array,String

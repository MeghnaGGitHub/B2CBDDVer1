package org.example;

public class MaxNumInArray {
    public static void main(String[] args) {
        int[] arr={4,3,5,2,1,6};
        int max=arr[0];
        for (int i =0 ; i < arr.length; i++) {
            if (max<arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}

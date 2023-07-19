package org.example;

public class MinInArray {
    public static void main(String[] args) {
        int[] arr={4,3,5,2,1,6};
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min>arr[i])
            {
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}

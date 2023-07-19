package org.example;

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int[] a={1,1,1,2,2,2,3,3,4,4};
        int temp=0;
        for (int i = 0; i <a.length ; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if (a[i]==a[j])
                {
                    System.out.println("First duplicate element :"+a[j]);
                    temp=temp+1;
                    break;
                }
            }
            if (temp>0)
            {
                break;
            }
        }
    }
}

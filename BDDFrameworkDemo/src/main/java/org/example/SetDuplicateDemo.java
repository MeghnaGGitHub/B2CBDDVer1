package org.example;

import java.util.HashSet;
import java.util.Set;

public class SetDuplicateDemo {
    public static void main(String[] args) {
        int[] a={1,1,1,1,1,2,2,2,3,3,3,4,4,4,5,5};
        Set<Integer> s=new HashSet();
        for (int no:a) {
            if(s.add(no)==false)
            {
                System.out.println(no);
            }
        }
    }
}

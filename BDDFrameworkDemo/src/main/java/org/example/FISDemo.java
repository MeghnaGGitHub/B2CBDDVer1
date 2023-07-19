package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FISDemo {
    public static void main(String[] args) throws FileNotFoundException {
        /*--Write data into file--*/
        try {
            FileInputStream fis=new FileInputStream("readme.doc");
            /*--Read date from file--*/
            int project;
            while ((project = fis.read()) != -1) {
                System.out.print((char) project);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}

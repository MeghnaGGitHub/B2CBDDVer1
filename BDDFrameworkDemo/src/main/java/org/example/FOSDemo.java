package org.example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FOSDemo {
    public static void main(String[] args) throws FileNotFoundException {
        try{
        FileOutputStream fos=new FileOutputStream("readme.doc");
        /*--Write data into file--*/
      String text="BYE";
      byte[] project=text.getBytes();
      fos.write(project);
      //close fos
            fos.close();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

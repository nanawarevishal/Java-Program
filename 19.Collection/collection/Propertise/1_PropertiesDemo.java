package collection.Propertise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.*;

class PropertiseDemo{

    public static void main(String[] args) throws FileNotFoundException {
        
       Properties obj = new Properties();

       FileInputStream fis = new FileInputStream("Friends.properties");
       
       obj.load(fis);

       String name = obj.getProperty("Ahshish");
       System.out.println(name);

       obj.setProperty("Shashi", "Biencaps");

       FileOutputStream fos = new FileOutputStream("Friends.properties");
       obj.store(fos, "Updated By Vishal");

    }
}
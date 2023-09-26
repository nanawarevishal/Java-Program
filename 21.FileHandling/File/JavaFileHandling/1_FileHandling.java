package JavaFileHandling;

import java.io.*;

class FileDemo{

    public static void main(String[] args)throws IOException {
        
        File fobj = new File("Core2Web.txt");


        fobj.createNewFile();
    }
}

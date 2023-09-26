package JavaFileHandling;

import java.io.*;

class FileDemo4{

    public static void main(String[] args)throws IOException {
        
        File fobj1 = new File("Core2Web");

        fobj1.mkdir();

        File fobj2 = new File(fobj1, "code2");

        fobj2.createNewFile();
    }
}
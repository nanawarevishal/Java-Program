package JavaFileHandling;

import java.io.File;
import java.io.IOException;

class FileDemo3{

    public static void main(String[] args)throws IOException {
        
        File fobj1 = new File("FilehandDemo", "Core1.txt");

		fobj1.createNewFile();
		
		File fobj2 = new File("FilehandDemo", "Core");

		fobj2.mkdir();
    }
}

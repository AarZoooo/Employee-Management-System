import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MyFileOutputStream extends FileOutputStream{

    //Constructor
    public MyFileOutputStream(File file) throws FileNotFoundException {
        super(file);
    }
    
    
}

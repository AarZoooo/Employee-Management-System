import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MyFileInputStream extends FileInputStream {
    
    //Constructor
    public MyFileInputStream(File file) throws FileNotFoundException {
        super(file);
    }


}

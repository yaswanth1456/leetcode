package exceptionHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WritrToFile {
public void tofile() throws IOException{
	FileWriter fl = new FileWriter("ToFile.txt");
	 fl.write("Welcome to javaTpoint.");    
     fl.close();   
}public static void main(String[] args) throws IOException {
	WritrToFile wtf = new WritrToFile();
	wtf.tofile();
}
}

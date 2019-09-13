package exceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReade {
public void readFromFile() throws IOException{
	String File="src/exceptionHandling/info.txt";
FileReader fl = new FileReader(File);
BufferedReader bfr= new BufferedReader(fl);
String line;
while((line = bfr.readLine()) != null){
	System.out.println(line);
}
bfr.close();
}
public static void main(String[] args) throws IOException {
	FileReade fl = new FileReade();
	fl.readFromFile();
}
}

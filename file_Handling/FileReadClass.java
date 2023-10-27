package file_Handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReadClass {
	public static void main(String[] args) throws IOException {
		File f1 =new File("d:\\p5.txt");
		FileOutputStream f2=new FileOutputStream(f1);
		f2.write("hi hello kmfkfkf".getBytes());
		FileInputStream f3=new FileInputStream(f1);
		int x=f3.read();
		while(x!=-1) {
			System.out.print((char)x);
			x=f3.read();
		}
	}
  
	
	
}



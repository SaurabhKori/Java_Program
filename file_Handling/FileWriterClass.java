package file_Handling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterClass {
	public static void main(String[] args) {
		FileWriter f1=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Ente the text ....");
		String txt=sc.nextLine();
		try {
		 f1=new FileWriter("d:\\hello.txt");
		 f1.write("hello saurabh");
		 f1.write(txt);
//		 System.out.println(f1.length());
		 System.out.println("file is write");
		 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				f1.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

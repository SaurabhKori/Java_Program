package file_Handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileReadWithScanner {
	public static void main(String[] args) throws IOException {
		File f1=new File("d:\\shivam (1).docx");
try (//		FileOutputStream f2=new FileOutputStream(f1);
		//		f2.write("hi am java Program".getBytes());
		//		FileInputStream f3=new FileInputStream(f1);
		Scanner sc = new Scanner(f1)) {
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
			System.out.println("read");
		}
		
	
	 
	}

}

package file_Handling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileClass {
	public static void main(String[] args) {
//		File f1=new File("d:\\");
		File f1=new File("d:\\hi.txt");
		try {
			f1.createNewFile();
			System.out.println("File is created");
			
//			File [] x=f1.listFiles();
//			for (File p : x) {
//				System.out.println(p);
//			}
//		    FileOutputStream f2=new FileOutputStream(f1);
//		    f1.canWrite();
		    System.out.println(f1.length());
//		    System.out.println(f1.canRead());
//		    System.out.println("write...");
//		    System.out.println(f1.delete());
//		    System.out.println("File is deleted");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

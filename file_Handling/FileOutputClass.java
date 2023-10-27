package file_Handling;
import java.io.*;
public class FileOutputClass {
	public static void main(String[] args) throws IOException {
		File f1=new File("d:\\p3.txt");
		f1.createNewFile();
		
		FileOutputStream fos=new FileOutputStream(f1);
		
		fos.write(100);
		fos.write("Mohan is here".getBytes());
		byte[] k= {65, 66, 67, 68, 69, 70, 71, 72, 73};
		fos.write(k);
		fos.write(k,0,2);
		FileInputStream f2=new FileInputStream(f1);
//		System.out.println((char)f2.read());
//		System.out.println((char)f2.read());
		int x=f2.read();
		
		while(x!=-1) {
			System.out.print((char)x);
			x=f2.read();
		}

	}

}

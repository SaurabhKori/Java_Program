package string;

import java.util.Random;

import javax.sound.midi.SysexMessage;

public class Equal {
	 public static void main(String[] args) {
		int a=12;
		int b=13;
		String c="Mohan";
		String e=new String("Mohan");
		String d="mohan";
		String f=new String("Mohan");
		String g="Sohan";
		System.out.println(c==e);
		System.out.println(e==d);
		System.out.println(f==g);
		System.out.println(e==f);
		System.err.println("---------------------------------------");
		System.out.println(f.equals(e));
		System.out.println(c==d);
		Random r1=new Random();
		int num=r1.nextInt(10);
		System.out.println(num);
	}

}

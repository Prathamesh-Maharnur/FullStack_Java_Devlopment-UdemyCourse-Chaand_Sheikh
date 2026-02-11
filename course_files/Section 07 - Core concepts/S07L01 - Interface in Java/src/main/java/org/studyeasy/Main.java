package org.studyeasy;

public class Main {
	public static void main(String[] args) {
		SamsungPhone phone1 = new SamsungPhone();
		int p = phone1.processor();
		System.out.println(p);


		Iphone phone2 = new Iphone();
		String s;
		s = phone2.processor();
		System.out.println(s);



	}

}

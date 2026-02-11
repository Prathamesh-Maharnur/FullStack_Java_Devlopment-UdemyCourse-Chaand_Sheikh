package org.studyeasy;

public class Main {
	public static void main(String[] args) {
		SamsungPhone phone1 = new SamsungPhone();
		String p = phone1.processor();
		System.out.println(p);
		System.out.println(phone1.spaceInGb());

		Iphone phone2 = new Iphone();
		String s;
		s = phone2.processor();
		System.out.println(s);
		System.out.println(phone2.spaceInGb());



	}

}

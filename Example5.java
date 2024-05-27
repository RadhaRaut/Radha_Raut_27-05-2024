package com.javaarray;

public class Example5 {

	public static void main(String[] args) {
	
	//one line array declaration and initialization
	int studentMarks[] = {45, 78, 98, 67, 37, 87};
	
	
	System.out.println(studentMarks[0]);
	System.out.println(studentMarks[1]);
	System.out.println(studentMarks[2]);
	System.out.println(studentMarks[3]);
	System.out.println(studentMarks[4]);
	System.out.println(studentMarks[5]);
	
	System.out.println("------------------------------------------");
	
	for(int i=0; i< studentMarks.length; i++) {
		System.out.println(studentMarks[i]);
	}
	

	
	
	}

}

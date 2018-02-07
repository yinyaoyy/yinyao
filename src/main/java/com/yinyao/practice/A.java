package com.yinyao.practice;

public class A {

	public static int a = 10;
	public static void main(String[] args) {

		A.a++;
		System.out.println(a);
		A b = new A();
	    b.a++;
	    System.out.println(a);
	    A a1 = new A();
	    a1.a++;
	    b = new A();
	    b.a++;
	    A.a++;
	    System.out.println(a);
		String[] aa = new String[10];
        System.out.println(aa[5]);
        float[] ii = new float[10];
        System.out.println();
        System.out.println(ii[7]);
	}

}

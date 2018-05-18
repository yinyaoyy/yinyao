package com.yinyao.practice;

public class ContinueAndBreak {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6};
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]==5){
				break;
			}
			j+=a[i];
		}
		System.out.println(j);
	}
}

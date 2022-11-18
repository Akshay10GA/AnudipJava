package com.calculation;

import java.util.ArrayList;
import java.util.List;

public class Calculation {
	public int Addition(int a1,int a2) {
		return a1 + a2;
	}
	
	public int Multiplication(int a1,int a2) {
		return a1 * a2;
	}
	
	public boolean Palindrome(String str) {
		boolean pal = false;
		String test = "";
		int len = str.length()-1;
		for(int i=len;i>=0;i--) {
			test = test + str.charAt(i);
		}
		if(test.equals(str)) {
			pal = true;
		}
	return pal;
	}
	
	public int sizeOflist(List<String> li) {
		int count = 0;
		for(String a:li) {
			count++;
		}
		return count;
	}
	
	public boolean isZero(List<String> li) {
		boolean iszero;
		int count = 0;
		for(String a:li) {
			count++;
		}
		if(count>0)
			iszero = false;
		else
			iszero = true;
	return iszero;
	}
	
	

}

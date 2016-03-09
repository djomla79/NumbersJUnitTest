package com.bildit.numbers.tdd;

public class RomanNumbers {

	public int testAll(String str) {
		
		int num = 0;
		
		if (str == "") {
			return num;
		}
		
		for (int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if (ch == 'M') {
				num += 1000;
			}
			if (ch == 'D') {
				num += 500;
			}
			if (ch == 'C') {
				num += 100;
			}
			if (ch == 'L') {
				num += 50;
			}
			if (ch == 'X') {
				num += 10;
			}
			if (ch == 'V') {
				num += 5;
			}
			if (ch == 'I') {
				num += 1;
			}
		}
		
		if (str.contains("CM")) {
			num -= 200;
		}
		if (str.contains("CD")) {
			num -= 200;
		}
		if (str.contains("XC")) {
			num -= 20;
		}
		if (str.contains("XL")) {
			num -= 20;
		}
		if (str.contains("IX")) {
			num -= 2;
		}
		if (str.contains("IV")) {
			num -= 2;
		}
		return num;
	}
	
}

package com.bildit.numbers.tdd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RomanNumbersTest {
	
	RomanNumbers num;
	
	@Before
	public void setUp() {
		num = new RomanNumbers();
	}
	
	@Test
	public void case0() {
		String str = "";
		int exp = 0;
		int result = num.testAll(str);
		assertEquals(exp, result);
	}
	
	@Test
	public void case1() {
		String str = "I";
		int expected = 1;
		int result = num.testAll(str);
		assertEquals(expected, result);
	}
	@Test
	public void case4() {
		String str = "IV";
		int expected = 4;
		int result = num.testAll(str);
		assertEquals(expected, result);
	}
	
	@Test
	public void case5() {
		String str = "V";
		int expected = 5;
		int result = num.testAll(str);
		assertEquals(expected, result);
	}
	
	@Test
	public void case9() {
		String str = "IX";
		int expected = 9;
		int result = num.testAll(str);
		assertEquals(expected, result);
	}
	
	@Test
	public void case10() {
		String str = "X";
		int expected = 10;
		int result = num.testAll(str);
		assertEquals(expected, result);
	}
	
	@Test
	public void case40() {
		String str = "XL";
		int expected = 40;
		int result = num.testAll(str);
		assertEquals(expected, result);
	}
	
	@Test
	public void case50() {
		String str = "L";
		int expected = 50;
		int result = num.testAll(str);
		assertEquals(expected, result);
	}
	
	@Test
	public void case90() {
		String str = "XC";
		int expected = 90;
		int result = num.testAll(str);
		assertEquals(expected, result);
	}
	
	@Test
	public void case100() {
		String str = "C";
		int expected = 100;
		int result = num.testAll(str);
		assertEquals(expected, result);
	}
	
	@Test
	public void case400() {
		String str = "CD";
		int expected = 400;
		int result = num.testAll(str);
		assertEquals(expected, result);
	}
	
	@Test
	public void case500() {
		String str = "D";
		int expected = 500;
		int result = num.testAll(str);
		assertEquals(expected, result);
	}
	
	@Test
	public void case900() {
		String str = "CM";
		int expected = 900;
		int result = num.testAll(str);
		assertEquals(expected, result);
	}
	
	@Test
	public void case1000() {
		String str = "M";
		int expected = 1000;
		int result = num.testAll(str);
		assertEquals(expected, result);
	}
	
	@Test
	public void caseAll() {
		String str = "MMMMCDXLIV";
		int expected = 4444;
		int result = num.testAll(str);
		assertEquals(expected, result);
	}
	
}

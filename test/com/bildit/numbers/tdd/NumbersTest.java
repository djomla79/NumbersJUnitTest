package com.bildit.numbers.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class NumbersTest {
	
	Numbers num;
	
	@Before
	public void setUp() throws Exception {
		num = new Numbers();
	}
	@Test
	public void case1() {
		
		int broj = 0;
		
		String expected = "";
		
		String result = num.returnEmptyStringIfZero(broj);
		
		assertEquals(expected, result);
	}
	@Test
	public void case8() {
		
		int broj = 8;
		String expected = "VIII";
		String result = num.returnRoman5to8(broj);
		assertEquals(expected, result);
		
	}
	@Test
	public void case9() {
		
		int broj = 9;
		String expected = "IX";
		String result = num.returnRomeNineToNine(broj);
		assertEquals(expected, result);
		
	}
	@Test
	public void case30() {
		
		int broj = 30;
		String expected = "XXX";
		String result = num.returnRoman10to30(broj);
		assertEquals(expected, result);
		
	}
	@Test
	public void case40() {
		
		int broj = 40;
		String expected = "XL";
		String result = num.returnRoman40(broj);
		assertEquals(expected, result);
		
	}
	@Test
	public void caseFrom10to99() {
		
		int broj = 99;
		String expected = "XCIX";
		String result = num.returnRomeFrom10to99(broj);
		assertEquals(expected, result);
	}
	@Test
	public void caseFrom100to300() {
		
		int broj = 300;
		String expected = "CCC";
		String result = num.returnRomeFrom100to300(broj);
		assertEquals(expected, result);
		
	}
	@Test
	public void case400() {
		
		int broj = 400;
		String expected = "CD";
		String result = num.returnRome400(broj);
		assertEquals(expected, result);
		
	}
	@Test
	public void caseFrom500to800() {
		
		int broj = 700;
		String expected = "DCC";
		String result = num.returnRomeFrom500to800(broj);
		assertEquals(expected, result);
		
	}
	@Test
	public void case900() {
		
		int broj = 900;
		String expected = "CM";
		String result = num.returnRome900(broj);
		assertEquals(expected, result);
		
	}
	@Test
	public void caseFrom1to999() {
		
		int broj = 712;
		String expected = "DCCXII";
		String result = num.returnRomeFrom1to999(broj);
		assertEquals(expected, result);
		
	}
	@Test
	public void caseFrom1000to4000() {
		
		int broj = 4000;
		String expected = "MMMM";
		String result = num.returnRomeFrom1000to4000(broj);
		assertEquals(expected, result);
		
	}
	@Test
	public void caseFrom1to4999() {
		
		int broj = 4999;
		String expected = "MMMMCMXCIX";
		String result = num.returnRomeFrom1to4999(broj);
		
		assertEquals(expected, result);
		
	}
}

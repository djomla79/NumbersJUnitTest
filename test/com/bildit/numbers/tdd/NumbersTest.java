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
	public void whenInputIntOneThenReturnRome() {
		
		int one = 1;
		
		String expected = "I";
		
		String result = num.returnRomeOne(one);
		
		assertEquals(expected, result);
	}
	
	@Test
	public void case2() {
		
		int broj = 2;
		String expected = "II";
		String result = num.returnRomeTwoToTwo(broj);
		assertEquals(expected, result);
		
	}
	@Test
	public void case3() {
		
		int broj = 2;
		String expected = "II";
		String result = num.returnRomeThreeToThree(broj);
		assertEquals(expected, result);
		
	}
	@Test
	public void case4() {
		
		int broj = 4;
		String expected = "IV";
		String result = num.returnRomeFourToFour(broj);
		assertEquals(expected, result);
		
	}
	@Test
	public void case5() {
		
		int broj = 5;
		String expected = "V";
		String result = num.returnRomeFiveToFive(broj);
		assertEquals(expected, result);
		
	}
	@Test
	public void case6() {
		
		int broj = 6;
		String expected = "VI";
		String result = num.returnRomeSixToSix(broj);
		assertEquals(expected, result);
		
	}
	@Test
	public void case7() {
		
		int broj = 7;
		String expected = "VII";
		String result = num.returnRomeSevenToSeven(broj);
		assertEquals(expected, result);
		
	}
	@Test
	public void case8() {
		
		int broj = 8;
		String expected = "VIII";
		String result = num.returnRomeEightToEight(broj);
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
	public void case10() {
		
		int broj = 10;
		String expected = "X";
		String result = num.returnRomeTenToTen(broj);
		assertEquals(expected, result);
		
	}
	@Test
	public void case20() {
		
		int broj = 20;
		String expected = "XX";
		String result = num.returnRomeTwentyToTwenty(broj);
		assertEquals(expected, result);
		
	}
	@Test
	public void case30() {
		
		int broj = 30;
		String expected = "XXX";
		String result = num.returnRomeThirtyToThirty(broj);
		assertEquals(expected, result);
		
	}
	@Test
	public void case40() {
		
		int broj = 40;
		String expected = "XL";
		String result = num.returnRomeFourtyToFourty(broj);
		assertEquals(expected, result);
		
	}
	@Test
	public void case50() {
		
		int broj = 50;
		String expected = "L";
		String result = num.returnRomeFiftyToFifty(broj);
		assertEquals(expected, result);
		
	}
	@Test
	public void case60() {
		
		int broj = 60;
		String expected = "LX";
		String result = num.returnRomeSixtyToSixty(broj);
		assertEquals(expected, result);
		
	}
	@Test
	public void case70() {
		
		int broj = 70;
		String expected = "LXX";
		String result = num.returnRomeSeventyToSeventy(broj);
		assertEquals(expected, result);
		
	}
	@Test
	public void case80() {
		
		int broj = 80;
		String expected = "LXXX";
		String result = num.returnRomeEightyToEighty(broj);
		assertEquals(expected, result);
		
	}
	@Test
	public void case90() {
		
		int broj = 90;
		String expected = "XC";
		String result = num.returnRomeNinetyToNinety(broj);
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
	public void case100() {
		
		int broj = 100;
		String expected = "C";
		String result = num.returnRomeHundred(broj);
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
	public void case500() {
		
		int broj = 500;
		String expected = "D";
		String result = num.returnRome500(broj);
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
	public void caseFrom100to900() {
		
		int broj = 700;
		String expected = "DCC";
		String result = num.returnRomeFrom100to900(broj);
		//String result = cc.returnRomeFrom1to999(broj);
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
	public void case1000() {
		
		int broj = 1000;
		String expected = "M";
		String result = num.returnRome1000(broj);
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

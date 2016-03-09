package com.bildit.numbers.tdd;

public class Numbers {
	
	public String returnEmptyStringIfZero(int broj) {
		String result = "";
		if (broj == 0) {
			result = "";
		}
		return result;
	}
	public String returnRoman1to3(int broj) {
		StringBuilder result = new StringBuilder();
		if (broj == 1) {
			result.append("I");
		} else if (broj == 2) {
			result.append("II");
		} else if (broj == 3) {
			result.append("III");
		}
		return result.toString();
	}
	public String returnRoman4(int broj) {
		StringBuilder result = new StringBuilder();
		if (broj == 4) {
			result.append("IV");
		}
		return result.toString();
	}
	public String returnRoman5to8(int broj) {
		StringBuilder result = new StringBuilder();
		if (broj == 5) {
			result.append("V");
		} else if (broj == 6) {
			result.append("VI");
		} else if (broj == 7) {
			result.append("VII");
		} else if (broj == 8) {
			result.append("VIII");
		}
		return result.toString();
	}

	public String returnRomeNineToNine(int broj) {
		StringBuilder result = new StringBuilder();
		if (broj == 9) {
			result.append("IX");
		}
		return result.toString();
	}
	public String returnRomeOneToNine(int broj) {
		StringBuilder result = new StringBuilder();
		if (broj == 0) {
			result.append(returnEmptyStringIfZero(broj));
		} else if (broj == 1 || broj == 2 || broj == 3) {
			result.append(returnRoman1to3(broj));
		} else if (broj == 4) {
			result.append(returnRoman4(broj));
		} else if (broj == 5 || broj == 6 
				|| broj == 7 || broj == 8) {
			result.append(returnRoman5to8(broj));
		} else if (broj == 9) {
			result.append(returnRomeNineToNine(broj));
		}
		return result.toString();
	}
	public String returnRoman10to30(int broj) {
		StringBuilder result = new StringBuilder();

		int jednocifreni = broj % 10;
		int dvocifreni = broj / 10;

		String str = returnRomeOneToNine(jednocifreni);
		if (dvocifreni == 1) {
			result.append("X");
			result.append(str);
		} else if (dvocifreni == 2) {
			result.append("XX");
			result.append(str);
		} else if (dvocifreni == 3) {
			result.append("XXX");
			result.append(str);
		}
		return result.toString();
	}

	public String returnRoman40(int broj) {
		StringBuilder result = new StringBuilder();

		int jednocifreni = broj % 10;
		int dvocifreni = broj / 10;

		String str = returnRomeOneToNine(jednocifreni);
		if (dvocifreni == 4) {
			result.append("XL");
			result.append(str);
		}
		return result.toString();
	}
	public String returnRoman50to80(int broj) {
		StringBuilder result = new StringBuilder();

		int jednocifreni = broj % 10;
		int dvocifreni = broj / 10;

		String str = returnRomeOneToNine(jednocifreni);
		if (dvocifreni == 5) {
			result.append("L");
			result.append(str);
		} else if (dvocifreni == 6) {
			result.append("LX");
			result.append(str);
		} else if (dvocifreni == 7) {
			result.append("LXX");
			result.append(str);
		} else if (dvocifreni == 8) {
			result.append("LXXX");
			result.append(str);
		}
		return result.toString();
	}
	public String returnRoman90(int broj) {
		StringBuilder result = new StringBuilder();

		int jednocifreni = broj % 10;
		int dvocifreni = broj / 10;

		String str = returnRomeOneToNine(jednocifreni);
		if (dvocifreni == 9) {
			result.append("XC");
			result.append(str);
		}
		return result.toString();
	}
	public String returnRomeFrom10to99(int broj) {
		StringBuilder result = new StringBuilder();
		
		int dvocifreni = broj / 10;
		
		if (dvocifreni == 1 || dvocifreni == 2 || dvocifreni == 3) {
			result.append(returnRoman10to30(broj));
		} else if (dvocifreni == 4) {
			result.append(returnRoman40(broj));
		} else if (dvocifreni == 5 || dvocifreni == 6
				   || dvocifreni == 7 || dvocifreni == 8) {
			result.append(returnRoman50to80(broj));
		} else if (dvocifreni == 9) {
			result.append(returnRoman90(broj));
		}
		return result.toString();
	}
	public String returnRomeFrom1To99(int broj) {
		StringBuilder result = new StringBuilder();
		
		int dvocifreni = broj / 10;
		int jednocifreni = broj % 10;
		
		if (dvocifreni == 1 || dvocifreni == 2 || dvocifreni == 3) {
			result.append(returnRoman10to30(broj));
			result.append(returnRomeOneToNine(jednocifreni));
		} else if (dvocifreni == 4) {
			result.append(returnRoman40(broj));
			result.append(returnRomeOneToNine(jednocifreni));
		} else if (dvocifreni == 5 || dvocifreni == 6
				   || dvocifreni == 7 || dvocifreni == 8) {
			result.append(returnRoman50to80(broj));
			result.append(returnRomeOneToNine(jednocifreni));
		} else if (dvocifreni == 9) {
			result.append(returnRoman90(broj));
			result.append(returnRomeOneToNine(jednocifreni));
		}
		return result.toString();
	}
	public String returnRomeFrom100to300(int broj) {
		StringBuilder result = new StringBuilder();
		
		int trocifreni = broj / 100;
		
		if (trocifreni == 1) {
			result.append("C");
		} else if (trocifreni == 2) {
			result.append("CC");
		} else if (trocifreni == 3) {
			result.append("CCC");
		}
		return result.toString();
	}
	public String returnRome400(int broj) {
		StringBuilder result = new StringBuilder();
		
		int trocifreni = broj / 100;
		
		if (trocifreni == 4) {
			result.append("CD");
		}
		return result.toString();
	}
	public String returnRomeFrom500to800(int broj) {
		StringBuilder result = new StringBuilder();
		
		int trocifreni = broj / 100;
		
		if (trocifreni == 5) {
			result.append("D");
		} else if (trocifreni == 6) {
			result.append("DC");
		} else if (trocifreni == 7) {
			result.append("DCC");
		} else if (trocifreni == 8) {
			result.append("DCCC");
		}
		return result.toString();
	}
	public String returnRome900(int broj) {
		StringBuilder result = new StringBuilder();
		
		int trocifreni = broj / 100;
		
		if (trocifreni == 9) {
			result.append("CM");
		}
		return result.toString();
	}
	public String returnRomeFrom1to999(int broj) {
		StringBuilder result = new StringBuilder();
		
		int trocifreni = broj / 100;
		int temp = broj / 10;
		int dvocifreniTemp = temp % 10;
		int dvocifreni = dvocifreniTemp*10;
		int jednocifreni = broj % 10;
		
		if (trocifreni == 1 || trocifreni == 2 || trocifreni == 3) {
			result.append(returnRomeFrom100to300(broj));
			result.append(returnRomeFrom10to99(dvocifreni));
			result.append(returnRomeOneToNine(jednocifreni));
		} else if (trocifreni == 4) {
			result.append(returnRome400(broj));
			result.append(returnRomeFrom10to99(dvocifreni));
			result.append(returnRomeOneToNine(jednocifreni));
		}else if (trocifreni == 5 || trocifreni == 6
				   || trocifreni == 7 || trocifreni == 8) {
			result.append(returnRomeFrom500to800(broj));
			result.append(returnRomeFrom10to99(dvocifreni));
			result.append(returnRomeOneToNine(jednocifreni));
		} else if (trocifreni == 9) {
			result.append(returnRome900(broj));
			result.append(returnRomeFrom10to99(dvocifreni));
			result.append(returnRomeOneToNine(jednocifreni));
		}
		return result.toString();
	}
	public String returnRomeFrom1000to4000(int broj) {
		StringBuilder result = new StringBuilder();
		
		int _4cifreni = broj / 1000;
		
		if (_4cifreni == 1) {
			result.append("M");
		} else if (_4cifreni == 2) {
			result.append("MM");
		} else if (_4cifreni == 3) {
			result.append("MMM");
		} else if (_4cifreni == 4) {
			result.append("MMMM");
		}
		return result.toString();
	}
	public String returnRomeFrom1to4999(int broj) {
		StringBuilder result = new StringBuilder();
		
		int trocifreni = broj % 1000;
		
		if (broj < 10) {
			result.append(returnRomeOneToNine(broj));
		} else if (broj > 9 && broj < 100) {
			result.append(returnRomeFrom10to99(broj));
		} else if (broj > 99 && broj < 1000) {
			result.append(returnRomeFrom1to999(broj));
		} else if (broj > 999 && broj < 5000) {
			result.append(returnRomeFrom1000to4000(broj));
			result.append(returnRomeFrom1to999(trocifreni));
		}
		return result.toString();
	}
	
}

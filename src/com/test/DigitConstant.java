package com.test;
import java.util.ArrayList;
import java.util.List;

public  final class DigitConstant {

	public static List<String[]> digits = new ArrayList<>(9);

	private static int CASE_N= 3;
	
	public static void initialize(){
		String[] digit0 = {".","_",".",  
						   "|",".","|", 
						   "|","_","|"};
		digits.add(0, digit0);
		String[] digit1 = {".",".",".",  
						   ".",".","|", 
						   ".",".","|"};
		digits.add(1, digit1);
		String[] digit2 = {".","_",".",
				           ".","_","|", 
				           "|","_","."};
		digits.add(2, digit2);
		String[] digit3 = {".","_",".",  
				           ".","_","|", 
				           ".","_","|"};
		digits.add(3, digit3);
		String[] digit4 = {".",".",".",  
				           "|","_","|", 
				           ".",".","|"};
		digits.add(4, digit4);
		String[] digit5 = {".","_",".",  
				           "|","_",".", 
				           ".","_","|"};
		digits.add(5, digit5);
		String[] digit6 = {".","_",".",  
				           "|","_",".",
				           "|","_","|"};
		digits.add(6, digit6);
		String[] digit7 = {".","_",".",  
				           ".",".","|", 
				           ".","_","|"};
		digits.add(7, digit7);
		String[] digit8 = {".","_",".",  
				           "|","_","|", 
				           "|","_","|"};
		digits.add(8, digit8);
		String[] digit9 = {".","_",".",  
				           "|","_","|", 
				           ".","_","|"};
		digits.add(9, digit9);
	}
	

	public static String getCaseForLine(int line,long number){
		String[] digit = digits.get((int) number);
		String digitLine="";
		for(int j =0;j < CASE_N;j++) {
			digitLine = digitLine.concat(digit[line * CASE_N + j]);
		}
		return digitLine;

	}
}

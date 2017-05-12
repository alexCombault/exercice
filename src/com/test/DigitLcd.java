package com.test;

import java.util.ArrayList;
import java.util.List;

public class DigitLcd {

	public static void main(String[] args){
		if (args == null || args.length==0 || args[0].isEmpty()) {
			System.out.println("Bad arguments given");
			System.exit(1);
		}
		System.out.println("Display number :"+args[0]);
		DigitConstant.initialize();
		long number = Long.parseLong(args[0]);
		List<Long> result = new ArrayList<Long>();
		//Decompose Argument, number to display in long array
		int i = 0;
		long n=number;
		while (n > 0) {
			result.add(i, n % 10);
			i++;
			n /= 10;
		}

		//Display result in system out
		int length=result.size();
		//ligne  : il n'y a que 3 ligne
		for(int k=0;k<3;k++){
			//colonne
			String affichage = "";
			for(int j=0;j<length;j++){
				long numberToDisplay = result.get(length-1-j);
				affichage=affichage.concat(DigitConstant.getCaseForLine(k, numberToDisplay));
			}
			System.out.println(affichage);
		}
	}
	
}

package com.tom;

import java.util.Random;

public class PokerGame {

	public static void main(String[] args) {
		Random random= new Random();
		int number = random.nextInt(13)+1;
		int flower = random.nextInt(4);
		System.out.print(number);
		char c =0;
		switch(flower) {
		case 0:
			c = 'S';
		case 1:
			c = 'H';
		case 2:
			c = 'D';
		case 3:
			c = 'C';
		    break;
		}
		System.out.println(c);
		
		
		
	  /*  int num = random.nextInt(12)+1;
	    char[] chr = {'S','H','D','C'};
	    char box=(chr[random.nextInt(4)]);
	    System.out.print(num);
	    System.out.println(box);*/
	}

}

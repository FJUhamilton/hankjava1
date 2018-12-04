package com.tom;


/*建構子整副牌*/
public class PokerGame {

	public static void main(String[] args) {
		/*整副牌在NewBoxCard*/
		Poker poker= new Poker();
		poker.shuffle();
		poker.print();
		/*Card  card = new Card();
		card.print();*/
		/*int[] n= new int[10];		
		Card[] c = new Card[10];
		System.out.println(n[0]);
		c[0] = new Card(7);
		System.out.print(c[0].get());*/
		
		
		/*Random random= new Random();
		int num1 =random.nextInt(52)+1;
		int flower = num1 % 13 ;
		int label   = num1 /13  ;
		int number = random.nextInt(52)+1;
		char[] flowers ={0x2663,0x2666,0x2665,0x2660};
		int[] labels ={'A',2,3,4,5,6,7,8,9,10,'J','Q','K'};
	    for (int i=0;i<= 4 ;i++){
	    	System.out.println(i);
	    	System.out.print(flowers[i]);
	    }*/
	   
		
		/*int flower5 = random.nextInt(4);
		System.out.print(number);
		char c =0;
		switch(flower) {
		case 0:
			c = 'S';
			break;
		case 1:
			c = 'H';
			break;
		case 2:
			c = 'D';
			break;
		case 3:
			c = 'C';
		    break;
		}
		System.out.println(c);*/
		
		
		/*int num1 =random.nextInt(52)+1;
		int point = num1 % 13 ;
		System.out.print(point);
		int fl1   = num1 /13  ;
		char a =0;
		switch(flower) {
		case 0:
			a = 'S';
		case 1:
			a = 'H';
		case 2:
			a = 'D';
		case 3:
			a = 'C';
		    break;
		}
		System.out.println(a);*/
				
		
		
		
		/*  int num = random.nextInt(12)+1;
	    char[] chr = {'S','H','D','C'};
	    char box=(chr[random.nextInt(4)]);
	    System.out.print(num);
	    System.out.println(box);*/
	}

}

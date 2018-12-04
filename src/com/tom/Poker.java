package com.tom;
import java.util.Random;

public class Poker {
	int[] cards = new int[52];
	
    public Poker(){
    	for(int i=0; i<52;i++){
    		cards[i] = i;
    	}
    }
    public void shuffle(){
    	for (int i=0; i<52; i++){
    		Random random = new Random();
    		int r = new Random().nextInt(52);
    		Card tmp = cards[i];
    		cards[i]= cards[r]
    		cards[r]= tmp;		
    	}
    }
    
    public void print(){
    	char []types = {'\u2663','\u2666','\u2665','\u2660'};
    	for (int i =0; i<52 ; i++){
    		
    		 System.out.print( (cards[i]%13+1)+""+types[i/13]+" ");
    		 if (i%13 == 12)
    	     System.out.println();
    	}
    	
    }
}

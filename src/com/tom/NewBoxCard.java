package com.tom;

public class NewBoxCard {

	public static void main(String[] args) {
		 {
				char []types = {'\u2663','\u2666','\u2665','\u2660'};
				String[] point = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
				int[] cards = new int[52];
		        for(int i =0; i <52 ; i++) {
					cards[i]= i;
				}
				for (int card: cards) {
					int p= card%13;
					System.out.print(point[p]);
					System.out.print(types[card/13]+" ");
					if(card%13 ==12)
				       System.out.println();
					}
				}
			}

	}

/*¾ã°ÆµP*/

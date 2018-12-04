package com.tom;
import java.util.Random;
/*ÀH¾÷¥XµP*/
public class PokerGameTT {
		public static void main(String[] args) {
			{
			Random random =new Random();
			int num1 =random.nextInt(52);
			System.out.println(num1);
			char []types = {'\u2663','\u2666','\u2665','\u2660'};
			String[] point = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
			 int a = num1/13;
			 int b = num1%13;
			System.out.print(point[b]+""+types[a]);
			
			
		}
}
}
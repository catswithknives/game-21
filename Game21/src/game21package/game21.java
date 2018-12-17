package game21package;
import java.lang.Math;
//import java.util.ArrayList;
public class game21 {
	public int card1;
	public int card2;
	public int card3;
	public int total;


	//draw command
	public void random(){
		System.out.println("pickel");
		for (int l = 0; l<3 ; l++){
			System.out.println(l);

			int r = (int) Math.ceil(Math.random() * 13);
			if (r > 10)
				r = 10;
			if (r == 0)
				r = 1;
			if (l == 0){
				card1 = r;
				System.out.println(card1);
				total = card1;
			}
			else if (l == 1){
				card2 = r;
				System.out.println(card2);
				total += card2;
			}
			else if (l == 2){
				card3 = r;
				System.out.println(card3);

			}
		}
	}
	public void addThird(){
		total +=card3;
	}

	public int getCard1(){	
		return card1;	
	}
	public int getCard2(){	
		return card2;	
	}
	public int getCard3(){	
		return card3;	
	}
	public int gettotal(){
		return total;
	}

	//check command w/ winners
	public static String check(int p, int d){
		String winner = null;
		System.out.println(d);
		System.out.println(p);
		if (p > d && p <=21)
			winner = "Player wins";
		if (d > p && d <=21)
			winner = "Dealer wins";
		if (p == d)
			winner = "Tie game";
		if (p > 21 && d > 21)
			winner = "Both lose";
		if (p < d && d > 21 && p <= 21)
			winner = "Player wins";
		if (d < p && p > 21 && d <= 21)
			winner = "Dealer wins";

		return winner;
	}
}

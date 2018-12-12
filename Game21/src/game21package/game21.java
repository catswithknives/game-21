package game21package;
import java.lang.Math;
//import java.util.ArrayList;
public class game21 {
	static int card1;
	static int card2;
	static int card3;

	//draw command
	public static void random(){
		for (int l = 1; l == 3; l++){
			int r = (int) (Math.random()*13);
			if (r > 10)
				r = 10;
			if (r == 0)
				r = 1;
			if (l == 1)
				card1 = r;
			else if (l == 2)
				card2 = r;
			else if (l == 3)
				card3 = r;
		}
	}

	public static int getCard(int cardnumber){
		if (cardnumber == 1)
			return card1;
		else if (cardnumber == 2)
			return card2;
		else
			return card3;
		
	}

	//check command w/ winners
	public static String check(int p, int d){
		String winner = null;
		if (p > d && p <=21)
			winner = "Player wins";
		if (d > p && d <=21)
			winner = "Dealer wins";
		if (p == d)
			winner = "Player and dealer tie";
		if (p > 21 && d > 21)
			winner = "Both lose";
		if (p < d && d > 21 && p <= 21)
			winner = "Player wins";
		if (d < p && p > 21 && d <= 21)
			winner = "Dealer wins";

		return winner;
	}	
}

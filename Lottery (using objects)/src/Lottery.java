import java.util.Scanner;

public class Lottery {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Bets to generate: ");
		int loops = s.nextInt();
	
		Bet[] everyBet = new Bet[loops];
		
		for (int i = 0; i < loops; i++){
			Bet bet = new Bet();
			bet.generate();
			everyBet[i] = bet;
		}
		for (int i = 0; i < loops; i++){
			everyBet[i].print();
		}
		s.close();
		return;
	}

}

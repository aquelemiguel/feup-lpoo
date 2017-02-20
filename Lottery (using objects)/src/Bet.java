import java.util.Arrays;
import java.util.Random;

public class Bet {
	int numbers[] = new int[6];

	public Bet(){
	}
	public int[] getNumbers(){
		return numbers;
	}
	
	public void generate(){
		Random rnd = new Random();
		
		mainLoop:
		for (int i = 0; i < 6; i++){
			int thisGen = rnd.nextInt(49) + 1;
			for (int j = 0; j < 6; j++){
				if (thisGen == numbers[j]){
					i--;
					continue mainLoop;
				}
			}
			numbers[i] = thisGen; 
		}
		Arrays.sort(numbers); //Sorts the array in ascending order.
		return;
	}
	
	public void print(){
		for (int i = 0; i < 6; i++){
			System.out.print(numbers[i] + " ");
		}
		System.out.println("");
		return;
	}
}

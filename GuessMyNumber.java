import java.util.Scanner;
public class GuessMyNumber {
	public static void guessingNumberGame(){
		Scanner sc = new Scanner(System.in);
		int a = (int)(100* Math.random())+1;
		int K = 5;
		int i, guess;
		System.out.println("A number is chosen between 1 to 100.Guess the number within 5 trials.");
		for (i = 0; i < K; i++) {
			System.out.println("Guess the number:");
			guess = sc.nextInt();
			if (a == guess) {
				System.out.println("Congratulations! You guessed the number.");
				break;
			}
			else if (a > guess&& i != K - 1) {
				System.out.println("The number is greater than " + guess);
			}
			else if (a < guess&& i != K - 1) {
				System.out.println("The number is less than " + guess);
			}
			sc.close();
		}
		if (i == K) {
			System.out.println("You have exhausted K trials.");
			System.out.println("The number was " + a);
		}
	}
	public static void main(String arg[]){
		guessingNumberGame();
	}
}



import java.util.Scanner;


public class Userinputyoutube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		String answer;
		double numericAnswer;
		double sum;
		// answer = "Hi!";
//		System.out.println("Please, write something");
//		answer = in.nextLine();
		
//		System.out.println(answer);
//
//		System.out.println("Give me a number");
//		answer = in.nextLine();
//		
//		sum = Integer.parseInt(answer) + 10;
//				
//		System.out.println(sum);
		
		System.out.println("Give me a number");
		numericAnswer = in.nextDouble();
		
		sum = numericAnswer + 10;
		
		System.out.println(sum);
	}

}

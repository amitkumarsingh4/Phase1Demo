import java.util.Scanner;

public class AddingNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer number n");
		int n = input.nextInt();
		int sum = n * (n+1)/2;
		System.out.println("Sum is " + sum);
		
	}

}

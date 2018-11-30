import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CheckEvenOdd {
	public static void main(String[] args) {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in) );
	int num;
	
	System.out.println("Enter an Integer number:");
	
	try {
		num = Integer.parseInt(reader.readLine());
		if (num % 2 == 0) {
			System.out.println("Entered number is even");
		} else {
			System.out.println("Entered number is odd");
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
}

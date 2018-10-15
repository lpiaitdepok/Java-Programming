//www.journaldev.com
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaReadFromConsoleBufferedReader {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Input String:");
		String input = br.readLine();
		br.close();
		System.out.println("Input String in Lower Case = " + new String(input).toLowerCase());
	}
}

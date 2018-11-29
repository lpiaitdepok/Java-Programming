public class menuConsole1 {
	public static void main (String[] args) {
		char name;
		String cetak;
		try {
			do {
			System.out.print("please enter your name");
			System.out.flush();

			name = (char)System.in.read();
			cetak = "Hello ! "+name;

			System.out.println(cetak);
			} while (name != 'x');
		} catch (Exception e) {
			System.out.println("error"+e);
		}
	}
}
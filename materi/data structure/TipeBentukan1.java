public class TipeBentukan1 {
public enum umumahasiswa {
	umur1(17), umur2(18), umur3(19), umur4(20), umur5(21);  // Named constants

	private final int value;      // Private variable

	umumahasiswa(int value) {     // Constructor
		this.value = value;
	}

	int getValue() {              // Getter
		return value;
	}
}

	public static void main(String[] args) {
		umumahasiswa umursaya;
		umursaya = umumahasiswa.umur1;
		
		System.out.println("umumahasiswa."+umursaya);
		System.out.println("umumahasiswa.umur1="+umursaya.getValue());
	}
}

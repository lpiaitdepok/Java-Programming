import java.util.Scanner;

public class MyClass {

public static void main(String args[]) {

    Scanner sc=new Scanner(System.in) ;

	int a=sc.nextInt();

    float b=sc.nextFloat();
	
	// next line is need 
	// if you want to input string after number in separate lines
	sc.nextLine();
	
    String str=sc.nextLine();

    System.out.println(a);

    System.out.println(b);

	System.out.println(str);

}

}

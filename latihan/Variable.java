// The Java Tutorials. Oracle
class Variable
{
	public static void main( String[] args ){

	//number variable
    byte byteVal = 100;
    short shortVal = 10000;
    int intVal = 26;
	long longVal = 0L;
	float floatVal = 123.4f;
	double doubleVal = 123.4; // 1.234e2
	
	System.out.println(byteVal);
	System.out.println(shortVal);
	System.out.println(intVal);
	System.out.println(longVal);
	
	// char and string variable
	char charVal = 'C';
	char uniChar = '\u039A';
	String greeting = "Hello world";
	char[] helloArray = {'h', 'e', 'l', 'l', 'o'};
	String helloString = new String(helloArray);
	System.out.println(charVal);
	System.out.println(uniChar);
	System.out.println(greeting);
	System.out.println(helloArray);
	System.out.println(helloString);
	}
}

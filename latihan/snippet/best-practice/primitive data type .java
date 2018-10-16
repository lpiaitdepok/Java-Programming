//Wherever possible try to use Primitive types instead of Wrapper classes
int x = 10;
int y = 10;

Integer x1 = new Integer(10);
Integer y1 = new Integer(10);

System.out.println(x == y);
System.out.println(x1 == y1);

//The first sop will print true whereas the second one will print false. The problem is when comparing two wrapper class objects we cant use == operator. It will compare the reference of object and not its actual value. 
Boolean flag;

if(flag == true) {
	System.out.println("Flag is set");
} else {
	System.out.println("Flag is not set");
}

//The above code will give a NullPointerException as it tries to box the values before comparing with true and as its null.

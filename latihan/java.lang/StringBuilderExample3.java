/http://www.hudatutorials.com/* Save with file name StringBuilderExample3.java */ 
 
public class StringBuilderExample3
{
    public static void main(String args[])
    {
        //DECLARATION
        StringBuilder s1;
        //CREATE INSTANCE USING PARAMETER CONSTRUCTOR
        s1 = new StringBuilder("abcd");
        //REVERSE STRING USING REVERSE METHOD
        System.out.println("Reverse String is : " + s1.reverse());
    }
}

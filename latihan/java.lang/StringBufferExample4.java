http://www.hudatutorials.com//* Save with file name StringBufferExample4.java */
 
public class StringBufferExample4
{
    public static void main(String args[])
    {
        //DECLARATION
        StringBuffer s1;
        //CREATE INSTANCE USING PARAMETER CONSTRUCTOR
        s1 = new StringBuffer("Huda");
        //APPENDED STRING
        s1.append("Tutorials");
        System.out.println("String is : " + s1.toString());
    }
}

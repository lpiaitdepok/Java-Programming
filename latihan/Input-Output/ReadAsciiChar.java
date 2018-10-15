// http://www.java2s.com
public class ReadAsciiChar {

  public static void main(String[] args) throws Exception{
    int inChar;
    System.out.println("Enter a Character:");
      inChar = System.in.read();
      System.out.print("You entered ");
      System.out.println(inChar); // Ascii code
  }
}  

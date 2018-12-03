public class CheckIsDoubleNotANumeric {

   public static void main(String[] args) {

      Double d1 = new Double(-1.0/0.0);
      Double d2 = new Double(0.0/0.0);
  
      // returns true if this Double value is a Not-a-Number (NaN) 
      System.out.println(d1 + " = " + d1.isNaN());
  
      // returns false for other cases
      System.out.println(d2 + " = " + d2.isNaN());
   }
}  

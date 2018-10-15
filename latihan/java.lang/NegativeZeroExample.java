public class NegativeZeroExample
{
   public static void main(final String[] arguments)
   {
      final String negativeZeroString = "-0";
      final String positiveZeroString = "+0";
      final String zeroString = "0";
 
      final double negativeZeroDouble = Double.parseDouble(negativeZeroString);
      final double positiveZeroDouble = Double.parseDouble(positiveZeroString);
      final double zeroDouble = Double.parseDouble(zeroString);

      System.out.println("Zero         : " + zeroDouble);
      System.out.println("Positive Zero: " + positiveZeroDouble);
      System.out.println("Negative Zero: " + negativeZeroDouble);

      System.out.println("\nMath FUNCTIONS");
      System.out.println(  "Min(Zero, Negative Zero): "
                  + Math.min(zeroDouble, negativeZeroDouble) );
      System.out.println(  "Min(Negative Zero,Positive Zero): "
                  + Math.min(negativeZeroDouble, positiveZeroDouble) );
      System.out.println(  "Min(Zero,Positive Zero): "
                  + Math.min(zeroDouble, positiveZeroDouble) + "\n" );

      System.out.println(  "Max(Zero, Negative Zero): "
                  + Math.max(zeroDouble, negativeZeroDouble) );
      System.out.println(  "Max(Negative Zero,Positive Zero): "
                  + Math.max(negativeZeroDouble, positiveZeroDouble) );
      System.out.println(  "Max(Zero,Positive Zero): "
                  + Math.max(zeroDouble, positiveZeroDouble) + "\n" );

      if ( positiveZeroDouble == negativeZeroDouble )
      {
         System.out.println("-0 is the same thing as +0\n");
      }
      else
      {
         System.out.println("-0 is NOT the same thing as +0\n");
      }

      if ( positiveZeroDouble > negativeZeroDouble )
      {
         System.out.println("+0 is greater than -0\n");
      }
      else if ( positiveZeroDouble < negativeZeroDouble )
      {
         System.out.println("+0 is less than -0\n");
      }
      else
      {
         System.out.println("+0 is neither less than nor greater than -0");
      }
   }
}

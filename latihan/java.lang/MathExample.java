public class MathExample
{
    public static void main(String args[])
    {
        //IF THE VALUE IS NEGITIVE IT RETURNS POSITIVE VALUE
        System.out.println("Absolute : " + Math.abs(-100.50));
 
        //IT INCREASE THE VALUE TO NEAREST INTEGER
        System.out.println("ceil : " + Math.ceil(100.55));
 
        //IT DECREASE THE VALUE TO NEAREST INTEGER
        System.out.println("floor : " + Math.floor(100.55));
 
        //IT RETURNS MAX NUMBER WITH IN THE GIVEN NUMBERS
        System.out.println("max : " + Math.max(100,200));
 
        //IT RETURNS MIN NUMBER WITH IN THE GIVEN NUMBERS
        System.out.println("min : " + Math.min(100,200));
 
        //IT RETURNS RANDOM NUMBER
        System.out.println("random : " + Math.random());
 
        //IT RETURNS WITHOUT FLOATING POINT
        System.out.println("round : " + Math.round(100.75));
 
        //IT RETURNS SQUARE ROOT
        System.out.println("sqrt : " + Math.sqrt(2));
 
        //IT RETURNS PI VALUE (22/7)
        System.out.println("PI : " + Math.PI);
 
        //RETURNS NATURAL LOGARITHM
        System.out.println("log : " + Math.log(10.55));
 
        //RETURNS BASE 10 LOGARITHM
        System.out.println("log10 : " + Math.log10(10.55));
 
        //RETURNS NATURAL LOGARITHM OF SUM OF THE ARGUMENT AND 1
        System.out.println("log1p : " + Math.log1p(10.55));
    }
}

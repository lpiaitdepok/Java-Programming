import java.lang.reflect.*;
 
public class ClassExample1
{
    public static void main(String args[])
    {
        //Student CLASS DECLARATION
        Student s;
 
        //CREATE INSTANCE FOR Student CLASS
        s = new Student(1, "B", "c");
 
        //Class CLASS DECLARATION
        Class c;
 
        //CREATE INSTANCE FOR Class CLASS
        //getClass() METHOD IS Object CLASS METHOD
        //IT IS CALLED FROM Student CLASS
        //BECAUSE Object CLASS IS SUPER (PARENT) CLASS
        c = s.getClass();
 
        //RETURNS THE CLASS NAME
        System.out.println("Class Name : " + c.getName());
 
        //RETURNS THE CLASS SIMPLE NAME
        System.out.println("Class Simple Name : " + c.getSimpleName());
 
        //RETURNS THE CLASS CANONICAL NAME
        System.out.println("Class Canonical Name : " + c.getCanonicalName());
 
        //RETURNS THE CLASS PACKAGE
        //RETURNS null IF NO PACKAGE DECLARED
        System.out.println("Package of the Class : " + c.getPackage());
    }
}

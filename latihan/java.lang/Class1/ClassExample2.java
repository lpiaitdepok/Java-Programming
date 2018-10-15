import java.lang.reflect.*;
 
public class ClassExample2
{
    public static void main(String args[])
    {
        //Student CLASS DECLARATION
        Student s;
 
        //CREATE INSTANCE FOR Student CLASS
        s = new Student(1, "B", "http://www.hudatutorials.com");
 
        //Class CLASS DECLARATION
        Class c;
 
        //CREATE INSTANCE FOR Class CLASS
        //getClass() METHOD IS Object CLASS METHOD
        //IT IS CALLED FROM Student CLASS
        //BECAUSE Object CLASS IS SUPER (PARENT) CLASS
        c = s.getClass();
 
        //GETTING THE FIELDS OF CLASS
        Field fields[] = c.getFields();
        System.out.println("FIELDS");
        System.out.println("======");
        for(int i=0;i<fields.length;i++)
        {
            System.out.println("Field "+ (i+1) + " => " + fields[i]);
        }
 
        System.out.println();
        //GETTING THE CONSTRUCTORS OF CLASS
        Constructor con[] = c.getConstructors();
        System.out.println("CONSTRUCTORS");
        System.out.println("============");
        for(int i=0;i<con.length;i++)
        {
            System.out.println("Constructor "+ (i+1) + " => " + con[i]);
        }
 
        System.out.println();
        //GETTING THE METHODS OF CLASS
        Method m[] = c.getMethods();
        System.out.println("METHODS");
        System.out.println("=======");
        for(int i=0;i<m.length;i++)
        {
            System.out.println();
            System.out.format("Method %3d  => " + m[i], (i+1));
        }
    }
}

//Student IS THE CLASS NAME
public class Student
{
    //FIELDS OF THE Student CLASS
    public int sid;
    public String sname;
    public String scollege;
 
    //CONSTRUCTORS OF THE Student CLASS
    public Student(){}
 
    public Student(int sid, String sname, String scollege)
    {
        this.sid = sid;
        this.sname = sname;
        this.scollege = scollege;
    }
 
    //SETTER METHODS OF THE Student CLASS
    public void setStudentID(int sid)
    {
        this.sid = sid;
    }
 
    public void setStudentName(String sname)
    {
        this.sname = sname;
    }
 
    public void setStudentCollege(String scollege)
    {
        this.scollege = scollege;
    }
 
    //GETTER METHODS OF THE Student CLASS
    public int getStudentID()
    {
        return this.sid;
    }
 
    public String getStudentName()
    {
        return this.sname;
    }
 
    public String getStudentCollege(String scollege)
    {
        return this.scollege;
    }
 
    public String toString()
    {
        return (this.sid+" "+this.sname+" "+this.scollege);
    }
}

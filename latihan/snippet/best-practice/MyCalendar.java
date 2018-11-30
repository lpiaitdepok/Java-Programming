//Never make an instance fields of class public

//Making a class field public can cause lot of issues in a program. For instance you may have a class called MyCalender. This class contains an array of String weekdays. You may have assume that this array will always contain 7 names of weekdays. But as this array is public, it may be accessed by anyone. Someone by mistake also may change the value and insert a bug!

public class MyCalendar {
	
	public String[] weekdays = 
		{"Sun", "Mon", "Tue", "Thu", "Fri", "Sat", "Sun"};
	
	//some code	
	
}

//Best approach as many of you already know is to always make the field private and add a getter method to access the elements.

private String[] weekdays = {"Sun", "Mon", "Tue", "Thu", "Fri", "Sat", "Sun"};

public String[] getWeekdays() {
  return weekdays;
}

//But writing getter method does not exactly solve our problem. The array is still accessible. Best way to make it unmodifiable is to return a clone of array instead of array itself. Thus the getter method will be changed to.

public String[] getWeekdays() {
  return weekdays.clone();
}

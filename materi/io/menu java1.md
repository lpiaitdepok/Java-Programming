```java
import java.io.*;
```

```java
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
```

```java
System.out.println("Do you want to continue: y/n");  
String s=br.readLine();  
if(s.startsWith("n")){  

}
```

```java
System.out.println("Enter one of the following commands:");
System.out.println("1 - something..");
System.out.println("2 - something else..");
System.out.println("3 - exit");
Scanner scanchoice = new Scanner(System.in);
System.out.println();
System.out.println("Enter \"1\", \"2\" or \"3\"");
int choiceentry = scanchoice.nextInt();
```

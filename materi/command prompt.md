# Buffered Reader
```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

    try {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while ( (line = br.readLine()) != null) {
            buffer.append(line);//.append("\n");
        }
    } catch (IOException ioe) {
        ioe.printStackTrace();  
    }
    
        int a = Integer.parseInt(br.readLine()); 
        System.out.println("Enter a String"); 
        String b = br.readLine();
```
# BufferedReader and StringTokenizer

# DataInputStream

# Scanner
```
import java.util.Scanner;
// Using Scanner class to take input 
Scanner sc = new Scanner(System.in); 

// Number of testcase input 
int t = sc.nextInt();
String b = scn.nextLine();
```
# Console
````
// Using Console to input data from user 
String name = System.console().readLine(); 
````

# Runtime
```
Runtime rt = Runtime.getRuntime();
Process proc = rt.exec("ping localhost");
```

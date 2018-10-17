referensi:alvinalexander.com

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
| STATEMENT     | DESCRIPTION                                                                              | 
|---------------|------------------------------------------------------------------------------------------| 
| next          | finds and returns the next complete token from this scanner                              | 
| next(pattern) | returns the next token if it matches the specified pattern                               | 
| nextBoolean   | returns true if the next token in this scanner's input can be interpreted                | 
|               | as a boolean value using a case insensitive pattern created from the string "true|false" | 
| nextByte      | scans the next token of the input as a byte                                              | 
| nextDouble    | scans the next token of the input as a double                                            | 
| nextFloat     | scans the next token of the input as a float                                             | 
| nextInt       | scans the next token of the input as an int                                              | 
| nextLine      | advances this scanner past the current line and returns the input that was skipped       | 
| nextLong      | scans the next token of the input as a long                                              | 
| nextShort     | scans the next token of the input as a short                                             | 


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

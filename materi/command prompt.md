# Buffered Reader
```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

    try {
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        StringBuffer buffer = new StringBuffer();
        String line = null;
        while ( (line = br.readLine()) != null) {
            buffer.append(line);//.append("\n");
        }
        message = buffer.toString();
    } catch (IOException ioe) {
        ioe.printStackTrace();  
    }
```

```
import java.util.Scanner;
// Using Scanner class to take input 
Scanner sc = new Scanner(System.in); 

// Number of testcase input 
int t = sc.nextInt();
```

# Runtime
```
Runtime rt = Runtime.getRuntime();
Process proc = rt.exec("ping localhost");
```

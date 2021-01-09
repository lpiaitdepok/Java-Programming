``` java
import java.io.File;

try {
// get current path
String path = new File(".").getCanonicalPath();
} catch (IOException ex) {
Logger.getLogger(PathDemo.class.getName()).log(Level.SEVERE, null, ex);
}
```

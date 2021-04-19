```java
public class function_parameter {
    
    public static void main(String[] args) {
    	Kotak k;
    	// instansiasi objek
		k = new Kotak();
		
		// Memanggil method isiData() (Parameter Aktual)
 		k.isiData(4,3,2);
		
		System.out.println("Volume kotak= " + k.hitungVolume());
    }
}
```

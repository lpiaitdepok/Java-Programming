//The wildcard character (*) is used to specify that all classes with that package are available to your program.

import javax.swing.*;  // Make all classes visible altho only one is used.

class ImportTest {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hi");
        System.exit(0);
    }
}

//Classes can be specified explicitly on import instead of using the wildcard character.

import javax.swing.JOptionPane;  // Make a single class visible.

class ImportTest {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hi");
        System.exit(0);
    }
}

//Alternately we can the fully qualified class name without an import.

class ImportTest {
    public static void main(String[] args) {
        javax.swing.JOptionPane.showMessageDialog(null, "Hi");
        System.exit(0);
    }
}

//Java 5 added an import static option that allows static variables (typically constants) to be referenced without qualifying them with a class name. For example, after
import static java.awt.Color;

//It would then be possible to write

   Color background = RED;

//instead of

   Color background = Color.RED;

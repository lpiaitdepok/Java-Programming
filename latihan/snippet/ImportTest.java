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

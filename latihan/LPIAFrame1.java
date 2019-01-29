import javax.swing.JFrame;
public class LPIAFrame1 extends JFrame {
  public static void main(String[] args) {
    //Create and set up the window.
    LPIAFrame1 frame = new LPIAFrame1();
    frame.setTitle("LPIA Frame");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    //Display the window.
    frame.setSize(920,199);
    // frame.pack();
    frame.setVisible(true);
  }    
}

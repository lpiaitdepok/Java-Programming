import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class BasicJavaGui1 extends Frame {
	BasicJavaGui() {
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
		
		setSize(100,100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new BasicJavaGui();
	}
}

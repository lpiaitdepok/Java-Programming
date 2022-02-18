import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JLabel;

public class LabelKomponen1 {
	private JLabel lblSatu;
	private JFrame frame1;
	
	public LabelKomponen1() {
		lblSatu = new JLabel("Text Pertama");
		
		frame1 = new JFrame("Kelas LabelKomponen");
		
		frame1.add(lblSatu);
		
		frame1.setSize(100,100);
		frame1.setVisible(true);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new LabelKomponen1();
	}
}

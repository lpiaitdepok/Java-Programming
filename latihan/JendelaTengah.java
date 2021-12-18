import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class JendelaTengah extends JFrame {

    // konstruktor
    public JendelaTengah() {
        initComponents();
        
        // mengambil ukuran layar
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();

        // membuat titik x dan y
        int x = layar.width / 2  - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;

        this.setLocation(x, y);
    }
                         
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("www.petanikode.com");

        getContentPane();
		add(jLabel1);

        pack();
    }                      

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JendelaPercobaan().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel jLabel1;
}

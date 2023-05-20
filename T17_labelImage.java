import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class T17_labelImage extends JFrame {
    
    private Container c;
    private JLabel imgLabel;
    private ImageIcon img;

    private T17_labelImage() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 100, 500, 400);

        initComponents();
    }

    private void initComponents() {
        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);

        img = new ImageIcon("mapleLeaf.jpg");
        // img = new ImageIcon(getClass().getResource("mapleLeaf.jpg")); // alternative command
        imgLabel = new JLabel(img);
        imgLabel.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
        c.add(imgLabel);
    }

    public static void main(String[] args) {
        new T17_labelImage();
    }

}

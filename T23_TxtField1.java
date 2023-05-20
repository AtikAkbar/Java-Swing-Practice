import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Container;
public class T23_TxtField1 extends JFrame{

    private Container c;
    private JTextField tf1, tf2;

    public T23_TxtField1() {
        initComponent();
    }
    private void initComponent() {
        c = getContentPane();
        c.setBackground(Color.ORANGE);
        c.setLayout(null);

        tf1 = new JTextField();
        tf1.setBounds(50, 50, 150, 30);
        c.add(tf1);

        tf2 = new JTextField();
        tf2.setBounds(50, 90, 150, 30);
        c.add(tf2);

        this.
    }

    public static void main(String[] args) {
        T23_TxtField1 frame = new T23_TxtField1();
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400, 200, 400, 300);

    }
}
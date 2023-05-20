import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class T14_LabelFontSizeStyle extends JFrame {
    
    private Container c;
    private JLabel userName, password;
    private Font f;

    public T14_LabelFontSizeStyle() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 100, 400, 300);

        setLayout(null);

        initComponents();
    }
    private void initComponents() {
        c = getContentPane();

        /*
         * To change font size and font style of the lable
         * 1. create an instance variable of Font class [look at the top ]
         * 2. create an object of Font class and put it in the variable
         * 3. set the font to the lable
         */
        f = new Font("Areal", Font.BOLD, 14);

        userName = new JLabel("Enter Username: ");
        userName.setFont(f);
        userName.setBounds(50, 50, 150, 50);
        c.add(userName);

        password = new JLabel("Enter Password: ");
        password.setFont(f);
        password.setBounds(50, 100, 150, 50);
        c.add(password);
    }
    public static void main(String[] args) {
        new T14_LabelFontSizeStyle();
    }    
}
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class T15_LabelFgBgColor extends JFrame {
    // 1. extends JFrame
    
    private Container c;
    // 7. create instance variabel of Container class from java.awt package
    private ImageIcon icon;
    private JLabel nameLabel, passLabel;
    private Font f;
    public T15_LabelFgBgColor() {
        /*
         * 3. create constructor
         * 4. setVisible(true)
         * 5. let the frame exit on close
         * 6. setBounds()
         * 7. setTitle()
         * 8. add favicon => setIconImage()
         */

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200, 100, 400, 300);

        this.setTitle("Java Swing Practice Frame");
        /*
         * To set a favIcon
         * 1. create an instance variable of ImageIcon class of javax.swing package
         * 2. create an object of the IconImage class and store it in the vareiable
         * 3. setIconImage(icon)
         * 4. as the method wants an image as an input make the icon an image by 
         * setIconImage(icon.getImage())
         */
        icon = new ImageIcon("book.png");
        this.setIconImage(icon.getImage());

        initComponents();
        
    }

    private void initComponents() {
        /*
         * 7. call initComponent method that holds further instructions for the frame
         * -> change ContentPane BG
         * -> add labels to the container
         * -> change font style and size of the label
         * -> change FG and BG of the lable
        */
        /*
         * to do all the above task,
         * first put the contentPane in a variable of Container class from java.awt
         * package
         */
        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        /*
         * To add label
         * 1. create instance vareabels of JLabel class from javax.swing package
         * 2. create object of JLabel and store in that variable
         * 3. set the default layout to null so I can position my label as I like
         * => setLayout(null); 
         * 4. setBounds()
         * 5. setFont();
         * 6. setForeground()
         * 7. you cannot directly change the BG for lable
         * 8. first setOpaque(true)
         * 9. then setBackground()
         * 
         * To change font
         * 1. create instance varaible of Font class from java.awt package
         * 2. create an object of Font class and store it in the variable
         */

        f = new Font(Font.DIALOG, Font.BOLD, 16);

        nameLabel = new JLabel("Enter Username: ");
        nameLabel.setBounds(50, 50, 150, 30);
        nameLabel.setFont(f);
        nameLabel.setForeground(new Color(7, 44, 11));
        nameLabel.setOpaque(true);
        nameLabel.setBackground(new Color(198, 246, 203));
        c.add(nameLabel);

        passLabel = new JLabel("Enter Password: ");
        passLabel.setBounds(50, 90, 150, 30);
        passLabel.setFont(f);
        passLabel.setForeground(new Color(7, 44, 11));
        passLabel.setOpaque(true);
        passLabel.setBackground(new Color(198, 246, 203));
        c.add(passLabel);
    }

    public static void main(String[] args) {
        // 2. create object of the class that extends JFrame
        new T15_LabelFgBgColor();
    }
}

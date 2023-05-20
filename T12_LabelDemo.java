import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Container;
// 6. import java.awt.Container 

public class T12_LabelDemo extends JFrame {
    // 1. extend JFrame

    private Container c;
    // 5. create instance variable of Container
    private JLabel label;
    // 9. create instance variable of JLabel

    public T12_LabelDemo() {
        // 3. create constructor
        initComponent();
    }

    private void initComponent() {
        // 4. create initialize Component method

        c = this.getContentPane();
        // 7. put the contentPnae in the container
        c.setLayout(null);
        // 15. set default layout to null
        c.setBackground(Color.PINK);
        // 8. change BG color of the contentPane
        label = new JLabel();
        // 10. create object for JLabel
        /* 11. To show text or image inside a frame use JLabel */
        label.setText("Enter your user name: ");
        // 12. set the text to the label
        c.add(label);
        // 13. add the lebel to the container
        /* 14. after I run the file the label is showing up in a odd position, 
         * as it is maintaining the default layout 
         * so change the layout */
        // 16. after setting the layout to null I will put my own position for the label
        label.setBounds(50, 20, 150, 50);
    }


    public static void main(String[] args) {

        // 2. Create a frame
        T12_LabelDemo frame = new T12_LabelDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 100, 500, 400);

        frame.setTitle("Lable Demo");
    }
}

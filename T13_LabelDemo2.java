import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Container;

public class T13_LabelDemo2 extends JFrame {
    // 1. extend JFrame
    private Container c;
    /*
     * 7. create an instance vairable of Container
     * 8. import package java.awt.Container
     * 9. create instance variables of JLabel 
     */
    private JLabel userName, password;


    public T13_LabelDemo2(){
        // 3. create constructor
        /*
         * 4. set the frame visible
         * 5. let it exit on close
         * 6. set the bounds
         */
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 100, 500, 400);

        initComponent();

        setLayout(null);
    }


    private void initComponent() {
        /*
         * To change the BG of contentPane
         * 1. put the contentPnae in the container variabel
         * 2. set a new BG for the container.
         */
        c = this.getContentPane();
        c.setBackground(new Color(159, 223, 146));

        /*
         * add Jlabel to container
         * 1. create new JLabel object and put it in variable
         * 2. add the labels to the container
         * 3. setLayout(null); [look at constructor]
         * 4. as the default layort is set to null
         * setBounds and put the label at desired location
         */
        userName = new JLabel("Enter User Name: ");
        userName.setBounds(50, 50, 150, 25);
        c.add(userName);

        password = new JLabel("Enter Password: ");
        password.setBounds(50, 75, 150, 25);
        c.add(password);
    }


    public static void main(String[] args) {
        // 2. create object
        new T13_LabelDemo2();
        
    }
}

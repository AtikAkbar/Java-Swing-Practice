import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Container;

public class T11_FrameBackground extends JFrame {    
    // 1. extend Jframe class

    /*
     * 8. creating an instance variable of container class and imported
     * java.awt.Container package
     */ 
    private Container c;

    public T11_FrameBackground() {
        // 6. inside constructor initialize component
        initComponent();
    }

    public void initComponent(){
        /*
         * 7. In a frame the space where the content is put is called "contentPane" 
         * to change the backgroud of contentPane first put it in a container and change the color of the container.
        */
        c = this.getContentPane();
        // 9. now change the BG color of the container
        c.setBackground(Color.GREEN);
    }

    public static void main(String[] args) {
        // 2. create frame object
        T11_FrameBackground frame = new T11_FrameBackground();
        // 3. set it visible
        frame.setVisible(true);
        // 4. let it exit on close
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 5. set the bounds
        frame.setBounds(200, 100, 400, 300);
    }
}

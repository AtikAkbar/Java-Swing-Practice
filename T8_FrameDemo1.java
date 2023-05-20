import javax.swing.JFrame;
    
public class T8_FrameDemo1 extends JFrame{

    public static void main(String[] args) {
        // If I don't extend, created an object of the JFrame class inside main function.
        // JFrame frame = new JFrame();
        // If I extend to Jframe all the Jframe properties are in T8_FrameDemo now, so I created an object for T8_FrameDemo
        T8_FrameDemo1 frame = new T8_FrameDemo1(); 
        // 1. created a frame in previous line but the frame is not showinw while I run the code
        frame.setVisible(true);
        // 2. so I set the frame visible so I can see the frema. but after I click the close btn the program is still runnig in the background.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 3. so I set Jframe Default Close Operation to Exit On Close.
        // 4. the freme is vary small so I set frame size -v
        // frame.setSize(400, 300);
        // 5. to bring the frame to the center of the screeen -v
        // frame.setLocationRelativeTo(null);
        // 6. I want to specify x and y coordinate of my frame location -v
        // frame.setLocation(100, 50);
        // 7. to use setLoction and setSize in a single function -v
        frame.setBounds(150, 100, 400, 300);
        // 8. to set title of the frame
        frame.setTitle("Frame Demo");
        // 9. I don't want people to resize my frmae 
        frame.setResizable(false);
    }
}
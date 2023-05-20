import javax.swing.JFrame;

public class T9_FrameDemo2 extends JFrame{
    // 1. extended JFrame

    public T9_FrameDemo2() {
        // 9. I 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400, 100, 400, 500);
        setTitle("Frame title");
    }
    public static void main(String[] args) {
        // JFrame frame = new JFrame();
        T9_FrameDemo2 frame = new T9_FrameDemo2();
        // 2. created a frame object
        frame.setVisible(true);
        // 3. made the frame visible
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 4. made the frema Exit_on_close
        // frame.setLocation(400, 100);
        // 5. set frame location to the center of the window.
        // frame.setSize(400, 500);
        // 6. set the size of the frame 
        // step 5 and 6 can be done in one step by using setBounds()
        // frame.setTitle("Frame title");
        // 7. set the title of the frame


        // 8. I won't wrtie the properties in the main function but inside the constructor
        
    }
}

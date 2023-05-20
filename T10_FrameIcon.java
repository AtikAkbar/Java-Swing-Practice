import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class T10_FrameIcon extends JFrame{
    
    private ImageIcon icon;

    public T10_FrameIcon() {

        ititComponents();
        // 2. in the constructor component will be initialized
    }

    public void ititComponents() {
        
        setBounds(200, 100, 400, 300);
        
        // 3. charecterestics of the component is written here
        // 4. to change the icon of the frame we need a icon 
        // 5. to put that icon need an object of ImageIcon class 
        // 6. object varaible was created at the top so the whole class can use it.
        icon = new ImageIcon("book.png");
        /*
         * #### up there insted of using "book.png" directly
         * getClass.getResource("book.png") can be used ####
         */
        // 7. we got the icon now to set the icon do -v
        this.setIconImage(icon.getImage());
        // 8. as setIconImage only supports image, we make the icon to image by icon.getImage()
    }
    public static void main(String[] args) {
        T10_FrameIcon frame = new T10_FrameIcon();
        // 1. created a frame object

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

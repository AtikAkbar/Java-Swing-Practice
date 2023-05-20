import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class T5_MessegeDialog3 {
    public static void main(String[] args) {

        ImageIcon icon = new ImageIcon("icons-mail-64.png");

        JOptionPane.showMessageDialog(null, "Enter correct password", "Wrong password", JOptionPane.PLAIN_MESSAGE, icon);
    }
}

import javax.swing.JOptionPane;

public class T7_ConfermDialog1 {
    public static void main(String[] args) {
        int choice =  JOptionPane.showConfirmDialog(null, "Are you ready !", null, JOptionPane.YES_NO_CANCEL_OPTION);

        if (choice == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "So you are ready. \nGood job keep up.", null, JOptionPane.PLAIN_MESSAGE);
        }
        else if(choice == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Are a pussy cat \nWhy aren't you ready yeat ?", null, JOptionPane.INFORMATION_MESSAGE);
        }
    }
}

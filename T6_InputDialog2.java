import javax.swing.JOptionPane;

public class T6_InputDialog2 {
    public static void main(String[] args) {
        String firstName = JOptionPane.showInputDialog("Enter your name: ", "Atik");
        String lastName = JOptionPane.showInputDialog("Enter Last name: ");

        String fullName = firstName + " " + lastName;

        JOptionPane.showMessageDialog(null, "Hello " + fullName , "Name", -1);
    }
}

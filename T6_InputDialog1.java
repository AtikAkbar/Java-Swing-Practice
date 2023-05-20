import javax.swing.JOptionPane;

public class T6_InputDialog1 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, name + " Welcome to Swing", "Swing", -1);
    }
}

/*
 * [ JOptionPane.showInputDialog("Enter your name: "); ] eta diye user theke
 * input nibo
 * [String name =] eta diye <name> variable e input ta ke store korbo
 * [JOptionPane.showMessageDialog(null, name + " Welcome to Swing", "Swing",-1);] eta diye oi <name> shoho ekta messege show korbo
 */
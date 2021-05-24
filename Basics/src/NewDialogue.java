import javax.swing.JOptionPane;

public class NewDialogue {
    public static void main(String[] args) {
        String days = JOptionPane.showInputDialog("What's the day today?");

        String message = String.format("Today is %s", days);
        JOptionPane.showMessageDialog(null, message);
    }
}

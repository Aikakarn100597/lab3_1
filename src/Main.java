import javax.swing.*;

public class Main {
    public static void main(String[] agrs) {
        //String input = JOptionPane.showInputDialog("ใส่ตัวเลข 1 ตัว", "0");
        //JOptionPane.showMessageDialog(null, input, "title", JOptionPane.INFORMATION_MESSAGE);
        int ans = JOptionPane.showConfirmDialog(null,
                "Do you love me?", "ถามเธอ", JOptionPane.YES_NO_OPTION);
        if (ans == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "");
        } else {
            JOptionPane.showMessageDialog(null, "จำไว้เลย");
        }
    }
}

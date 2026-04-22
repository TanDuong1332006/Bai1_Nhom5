package baitapnhom5;
import javax.swing.*;

public class SoLonNhat extends JFrame {
    public SoLonNhat() {
        setTitle("Tìm Max");
        setSize(300, 250);
        setLayout(null);

        JTextField t1 = new JTextField(); t1.setBounds(20, 20, 100, 25); add(t1);
        JTextField t2 = new JTextField(); t2.setBounds(20, 50, 100, 25); add(t2);
        JTextField t3 = new JTextField(); t3.setBounds(20, 80, 100, 25); add(t3);
        JButton btn = new JButton("Tìm Max"); btn.setBounds(20, 120, 100, 30); add(btn);

        btn.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = Integer.parseInt(t3.getText());
            int max = Math.max(a, Math.max(b, c));
            JOptionPane.showMessageDialog(this, "Số lớn nhất là: " + max);
        });
        setVisible(true);
    }
    public static void main(String[] args) { new SoLonNhat(); }
}
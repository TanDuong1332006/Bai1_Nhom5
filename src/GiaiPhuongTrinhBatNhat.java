import javax.swing.*;

public class GiaiPhuongTrinhBatNhat extends JFrame {
    public GiaiPhuongTrinhBatNhat() {
        setTitle("Giải phương trình ax + b = 0");
        setSize(400, 200);
        setLayout(null);

        JLabel lbA = new JLabel("Nhập a:"); lbA.setBounds(20, 20, 50, 25); add(lbA);
        JTextField txtA = new JTextField(); txtA.setBounds(80, 20, 100, 25); add(txtA);
        JLabel lbB = new JLabel("Nhập b:"); lbB.setBounds(20, 50, 50, 25); add(lbB);
        JTextField txtB = new JTextField(); txtB.setBounds(80, 50, 100, 25); add(txtB);

        JButton btn = new JButton("Giải"); btn.setBounds(80, 90, 100, 30); add(btn);

        btn.addActionListener(e -> {
            double a = Double.parseDouble(txtA.getText());
            double b = Double.parseDouble(txtB.getText());
            if (a == 0) {
                if (b == 0) JOptionPane.showMessageDialog(this, "Vô số nghiệm");
                else JOptionPane.showMessageDialog(this, "Vô nghiệm");
            } else {
                JOptionPane.showMessageDialog(this, "Nghiệm x = " + (-b / a));
            }
        });
        setVisible(true);
    }
    public static void main(String[] args) { new GiaiPhuongTrinhBatNhat(); }
}
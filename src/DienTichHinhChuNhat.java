import javax.swing.*;
import java.awt.event.*;

public class DienTichHinhChuNhat extends JFrame {
    public DienTichHinhChuNhat() {
        setTitle("Tính diện tích HCN");
        setSize(300, 200);
        setLayout(null);

        JLabel lb1 = new JLabel("Chiều dài:"); lb1.setBounds(20, 20, 100, 25); add(lb1);
        JTextField txtDai = new JTextField(); txtDai.setBounds(120, 20, 100, 25); add(txtDai);

        JLabel lb2 = new JLabel("Chiều rộng:"); lb2.setBounds(20, 50, 100, 25); add(lb2);
        JTextField txtRong = new JTextField(); txtRong.setBounds(120, 50, 100, 25); add(txtRong);

        JButton btnCalc = new JButton("Tính"); btnCalc.setBounds(80, 90, 100, 30); add(btnCalc);

        btnCalc.addActionListener(e -> {
            try {
                double d = Double.parseDouble(txtDai.getText());
                double r = Double.parseDouble(txtRong.getText());
                if (d <= 0 || r <= 0) {
                    JOptionPane.showMessageDialog(this, "Nhập sai. Cạnh phải > 0");
                } else {
                    JOptionPane.showMessageDialog(this, "Diện tích: " + (d * r));
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập số!");
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) { new DienTichHinhChuNhat(); }
}
package baitapnhom5;
import javax.swing.*;

public class NgayTrongThang extends JFrame {
    public NgayTrongThang() {
        setTitle("Tính ngày");
        setSize(300, 200);
        setLayout(null);

        JLabel l1 = new JLabel("Tháng:"); l1.setBounds(20, 20, 50, 25); add(l1);
        JTextField txtThang = new JTextField(); txtThang.setBounds(80, 20, 100, 25); add(txtThang);
        JLabel l2 = new JLabel("Năm:"); l2.setBounds(20, 50, 50, 25); add(l2);
        JTextField txtNam = new JTextField(); txtNam.setBounds(80, 50, 100, 25); add(txtNam);

        JButton btn = new JButton("Xem"); btn.setBounds(80, 90, 100, 30); add(btn);

        btn.addActionListener(e -> {
            int t = Integer.parseInt(txtThang.getText());
            int n = Integer.parseInt(txtNam.getText());
            int ngay = 0;
            switch(t) {
                case 1,3,5,7,8,10,12 -> ngay = 31;
                case 4,6,9,11 -> ngay = 30;
                case 2 -> ngay = ((n%400==0) || (n%4==0 && n%100!=0)) ? 29 : 28;
            }
            JOptionPane.showMessageDialog(this, "Tháng " + t + " năm " + n + " có " + ngay + " ngày");
        });
        setVisible(true);
    }
    public static void main(String[] args) { new NgayTrongThang(); }
}
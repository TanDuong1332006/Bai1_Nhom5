import javax.swing.*;

public class TienTaxi extends JFrame {
    public TienTaxi() {
        setTitle("Tính tiền Taxi");
        setSize(300, 150);
        setLayout(null);

        JLabel lb = new JLabel("Nhập km:"); lb.setBounds(20, 20, 80, 25); add(lb);
        JTextField txtKm = new JTextField(); txtKm.setBounds(100, 20, 100, 25); add(txtKm);
        JButton btn = new JButton("Tính tiền"); btn.setBounds(80, 60, 100, 30); add(btn);

        btn.addActionListener(e -> {
            double km = Double.parseDouble(txtKm.getText());
            if (km < 0) JOptionPane.showMessageDialog(this, "Nhập dữ liệu sai");
            else JOptionPane.showMessageDialog(this, "Tiền: " + (km * 10000) + " VNĐ");
        });

        setVisible(true);
    }
    public static void main(String[] args) { new TienTaxi(); }
}
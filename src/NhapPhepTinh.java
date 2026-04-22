import javax.swing.*;

public class NhapPhepTinh extends JFrame {
    public NhapPhepTinh() {
        setTitle("Máy tính");
        setSize(350, 200);
        setLayout(null);

        JTextField txtA = new JTextField(); txtA.setBounds(20, 20, 50, 25); add(txtA);
        JTextField txtB = new JTextField(); txtB.setBounds(80, 20, 50, 25); add(txtB);
        
        String[] operators = {"+", "-", "*", "/"};
        JComboBox<String> cb = new JComboBox<>(operators); cb.setBounds(150, 20, 50, 25); add(cb);
        
        JButton btn = new JButton("="); btn.setBounds(210, 20, 50, 25); add(btn);
        JLabel lbKq = new JLabel("Kết quả: "); lbKq.setBounds(20, 70, 200, 25); add(lbKq);

        btn.addActionListener(e -> {
            double a = Double.parseDouble(txtA.getText());
            double b = Double.parseDouble(txtB.getText());
            String op = (String) cb.getSelectedItem();
            double kq = 0;
            if(op.equals("+")) kq = a + b;
            else if(op.equals("-")) kq = a - b;
            else if(op.equals("*")) kq = a * b;
            else if(op.equals("/")) kq = a / b;
            lbKq.setText("Kết quả: " + a + " " + op + " " + b + " = " + kq);
        });

        setVisible(true);
    }
    public static void main(String[] args) { new NhapPhepTinh(); }
}
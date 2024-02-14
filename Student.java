import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student {
    private JTextField txtSname;
    private JTextField txtTotal;
    private JTextField txtAvg;
    private JTextField txtGrade;
    private JTextField txtPhy;
    private JTextField txtChe;
    private JTextField txtMath;
    private JButton calculateButton;
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student");
        frame.setContentPane(new Student().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Student() {
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int m1, m2,m3, tot;
                double avg;

                m1 = Integer.parseInt(txtPhy.getText());
                m2 = Integer.parseInt(txtChe.getText());
                m3 = Integer.parseInt(txtMath.getText());

                tot = m1 +m2+m3;
                txtTotal.setText(String.valueOf(tot));

                avg = tot/3;
                txtAvg.setText(String.valueOf(avg));

                if (avg>50){
                    txtGrade.setText("Pass");
                }else{
                    txtGrade.setText("Fail");
                }

            }
        });
    }
}

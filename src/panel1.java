import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class panel1 {
    private JPanel mainPanel;
    private JButton nextButton;


    public panel1() {
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Info");
                panel2 panel2 = new panel2();

                frame.add(panel2.getMainPanel());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // klo mencet tombol X bakal apa? exit on close itu matiin semua panel
                frame.pack(); // ukuran frame
                frame.setVisible(true); // haha true goes brrrrr
                frame.setLocationRelativeTo(null); // biar ditengah lmao si framenya
                frame.setBounds(450,450,400,250);
            }
        });
    }

    public static void main(String[] args){

        JFrame frame = new JFrame("Login");
        frame.setContentPane(new panel1().mainPanel); // main panele
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setBounds(400,450,400,250);
    }
}

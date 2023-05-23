import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class panel2 {


    private JPanel mainPanel;
    private JButton backButton;


    public panel2() {
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(backButton);
                // Dispose the frame
                frame.dispose();

            }
        });
    }

    public JPanel getMainPanel(){
        return mainPanel;
    }


}

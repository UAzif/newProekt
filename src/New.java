import javax.swing.*;
import java.awt.*;

public class New extends JFrame {
    New() {
        JFrame frame = new JFrame("new");
        Font font=new Font("Verdana",Font.PLAIN,10 );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFrame.setDefaultLookAndFeelDecorated(true);
        frame.setSize(500,400);
        JTextField textField=new JTextField();
        JButton button=new JButton("++");
        JLabel label=new JLabel("Label");
        JPanel panel = new JPanel();
        panel.add(textField);
        panel.add(button);
        panel.add(label);
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(new BoxLayout(panel,BoxLayout.LINE_AXIS));
        frame.add(panel);
        frame.setVisible(true);

    }

}

class Start {
    public static void main(String[] args) {
        new New();
    }
}

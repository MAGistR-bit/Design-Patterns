package command.swing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {
    private JFrame frame;
    private JPanel panel;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    private void go() {
        frame = new JFrame();
        panel = new JPanel();

        // The GUI is the client
        // The buttons are the invokers
        JButton onButton = new JButton("Angel");
        JButton offButton = new JButton("Devil");

        onButton.addActionListener(new AngelListener());
        offButton.addActionListener(new DevilListener());

        JLabel label = new JLabel("Versus");
        label.setOpaque(true);
        label.setBackground(Color.LIGHT_GRAY);

        frame.setContentPane(panel);
        panel.add(onButton);
        panel.add(label);
        panel.add(offButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    static class AngelListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Don't do it, you might regret it!");
        }
    }

    static class DevilListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Come on, do it!");
        }
    }
}

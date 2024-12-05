package GUI;

import javax.swing.*;

public class Main {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("GUI Example");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click me!");
        button.setBounds(100, 100, 200, 100);
        frame.add(button);

        button.addActionListener((e) -> {

            JOptionPane.showMessageDialog(frame, "You clicked the button!");

        });

        frame.setVisible(true);
        
    }

}

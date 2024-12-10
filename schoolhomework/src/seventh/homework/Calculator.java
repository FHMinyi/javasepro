package seventh.homework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private JTextField display;
    private double num1, num2;
    private String operator;

    public Calculator() {
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // 创建面板
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // 创建显示区域
        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(display, BorderLayout.NORTH);

        // 创建按钮面板
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 24));
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        panel.add(buttonPanel, BorderLayout.CENTER);

        add(panel);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.charAt(0) == 'C') {
                display.setText("");
                num1 = 0;
                num2 = 0;
                operator = "";
            } else if (command.charAt(0) == '=') {
                num2 = Double.parseDouble(display.getText());
                switch (operator) {
                    case "+":
                        display.setText(String.valueOf(num1 + num2));
                        break;
                    case "-":
                        display.setText(String.valueOf(num1 - num2));
                        break;
                    case "*":
                        display.setText(String.valueOf(num1 * num2));
                        break;
                    case "/":
                        if (num2 != 0) {
                            display.setText(String.valueOf(num1 / num2));
                        } else {
                            display.setText("Error");
                        }
                        break;
                }
                operator = "";
            } else if (command.charAt(0) == '+' || command.charAt(0) == '-' || command.charAt(0) == '*' || command.charAt(0) == '/') {
                num1 = Double.parseDouble(display.getText());
                operator = command;
                display.setText("");
            } else {
                display.setText(display.getText() + command);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }
}

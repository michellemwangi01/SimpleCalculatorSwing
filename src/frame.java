import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.*;

public class frame extends JFrame implements ActionListener {

    JTextField textField, textField2;
    JButton addButton, subButton;
    JTextField resultTextField;

    public frame() {

        // ---------------------Creating JFrame components------------------------
        JMenuBar mbar = new JMenuBar();
        JMenu m1 = new JMenu("File");
        JMenu m2 = new JMenu("Edit");
        JMenuItem mItem1 = new JMenuItem("Save");
        JMenuItem mItem2 = new JMenuItem("Save As");
        JMenuItem mItem3 = new JMenuItem("Undo");
        JMenuItem mItem4 = new JMenuItem("Redo");

        JPanel panel1 = new JPanel();
        JLabel label = new JLabel("Enter two numbers:");
        textField = new JTextField(10);
        JLabel labelOperator = new JLabel("+ / -");
        textField2 = new JTextField(10);
        JPanel panel2 = new JPanel();
        JLabel resultLabel = new JLabel("result");
        resultTextField = new JTextField(10);
        addButton = new JButton("Add");
        subButton = new JButton("Sub");

        // ----------add components to MenuBar, MenuItem & Panel------------
        mbar.add(m1);
        mbar.add(m2);
        m1.add(mItem1);
        m1.add(mItem2);
        m2.add(mItem3);
        m2.add(mItem4);
        panel1.add(label);
        panel1.add(textField);
        panel1.add(labelOperator);
        panel1.add(textField2);
        panel1.add(addButton);
        panel1.add(subButton);
        panel2.add(resultLabel);
        panel2.add(resultTextField);

        // ----------add MenuBar & Panel to Frame-----------
        add(panel1);
        add(panel2);
        add(mbar);

        // -----------------display settings--------------------

        panel1.setLocation(150, 150);
        getContentPane().add(BorderLayout.CENTER, panel1);
        getContentPane().add(BorderLayout.SOUTH, panel2);
        getContentPane().add(BorderLayout.NORTH, mbar);
        setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        setVisible(true);

        // ------------------add functionality to Button
        addButton.addActionListener(this);
        subButton.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        long num1 = Integer.parseInt(textField.getText());
        long num2 = Integer.parseInt(textField2.getText());
        long value;

        if (e.getSource() == addButton) {
            value = num1 + num2;

        } else {
            value = num1 - num2;

        }
        resultTextField.setText(value + "");

    }
}

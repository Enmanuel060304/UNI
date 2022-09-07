package operaciones;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class app extends JFrame {
    private JTextField textField1;
    private JPanel panel1;
    private JButton calcularButton;
    private JButton button1;
    private JButton pButton;
    private JButton qButton;
    private JButton button4;
    private JButton Ybutton;
    private JButton OButton;

    public app()
    {
        super("operaciones");
        final String[] textPanel = {String.format("")};
        setContentPane(panel1);

        /*accion del botton calcular*/
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "calcular");
            }
        });

        /*accion del botton 1*/
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + button1.getText());
            }
        });

        /*accion del botton 2*/
        pButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + pButton.getText());
            }
        });

        /*accion del botton 3*/
        qButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + qButton.getText());
            }
        });

        /*accion del botton 4*/
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + button4.getText());
            }
        });

        /*accion del botton Y*/
        Ybutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + Ybutton.getText());
            }
        });

        /*accion del botton O*/
            OButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + OButton.getText());
            }
        });
    }
}


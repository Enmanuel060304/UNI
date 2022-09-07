package operaciones;

import javax.swing.*;

public class main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new app();
                frame.setSize(450, 300);
                frame.setVisible(true);
            }
        });
    }
}

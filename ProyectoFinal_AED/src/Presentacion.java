import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Canvas;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Point;
import javax.swing.JMenuItem;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class Presentacion extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Presentacion frame = new Presentacion();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Presentacion() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Presentacion.class.getResource("/Image/UNI.png")));
		setForeground(Color.BLACK);
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 729, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Salir = new JButton("Salir");
		contentPane.add(Salir);
		Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		Salir.setBounds(518, 371, 89, 23);
		
		JButton Menu = new JButton("Menu");
		contentPane.add(Menu);
		Menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doBtnMenuActionPerformed(e);
			}
		});
		Menu.setBounds(614, 371, 89, 23);
		
		JLabel lblNewLabel_2 = new JLabel("Proyecto final AED\r\n");
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(10, 90, 141, 16);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		
		JLabel lblNewLabel_3 = new JLabel("Realizado por:");
		contentPane.add(lblNewLabel_3);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_3.setBounds(24, 110, 140, 22);
		
		JLabel lblNewLabel_6_1 = new JLabel("2021-0118U");
		contentPane.add(lblNewLabel_6_1);
		lblNewLabel_6_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_6_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_6_1.setBounds(285, 265, 89, 22);
		
		JLabel lblNewLabel_5_1 = new JLabel("Marlon Josue Gonzalez Cano");
		contentPane.add(lblNewLabel_5_1);
		lblNewLabel_5_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_5_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_5_1.setBounds(231, 245, 185, 22);
		
		JLabel MarlonFoto = new JLabel("Marlon");
		contentPane.add(MarlonFoto);
		MarlonFoto.setIcon(new ImageIcon(Presentacion.class.getResource("/Image/Marlon.jpeg")));
		MarlonFoto.setBounds(279, 146, 81, 88);
		
		
		JLabel lblNewLabel_5 = new JLabel("Jose Enmanuel Urbina Fierro");
		contentPane.add(lblNewLabel_5);
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_5.setBounds(10, 245, 183, 23);
		
		JLabel lblNewLabel_6 = new JLabel("2021-0269U");
		contentPane.add(lblNewLabel_6);
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_6.setBounds(53, 268, 83, 22);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Orlando Mauricio Guevara Castillo");
		contentPane.add(lblNewLabel_5_1_1);
		lblNewLabel_5_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_5_1_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_5_1_1.setBounds(468, 248, 224, 22);
		
		JLabel OrlandoFoto = new JLabel("Orlando");
		contentPane.add(OrlandoFoto);
		OrlandoFoto.setIcon(new ImageIcon(Presentacion.class.getResource("/Image/Orlando.jpeg")));
		OrlandoFoto.setBounds(533, 162, 89, 81);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("2021-0171U");
		contentPane.add(lblNewLabel_6_1_1);
		lblNewLabel_6_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_6_1_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_6_1_1.setBounds(533, 269, 83, 22);
		
		
		JLabel EnmanuelFoto = new JLabel("Enmanuel");
		contentPane.add(EnmanuelFoto);
		EnmanuelFoto.setIcon(new ImageIcon(Presentacion.class.getResource("/Image/Enmanuel.jpeg")));
		EnmanuelFoto.setBounds(58, 159, 89, 86);
		
		JLabel FONDO = new JLabel("New label");
		FONDO.setIcon(new ImageIcon(Presentacion.class.getResource("/Image/Photo-image-dark-wallpaper.png")));
		FONDO.setBounds(0, 0, 713, 405);
		contentPane.add(FONDO);
		
		JPanel panel = new JPanel();
		FONDO.add(panel);
		panel.setBackground(SystemColor.textHighlightText);
		panel.setBounds(0, 0, 713, 83);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Universidad Nacional de Ingenieria");
		lblNewLabel.setForeground(new Color(0, 0, 139));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel.setBounds(244, 11, 269, 33);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Facultad de Electronica y Computacion");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setBounds(254, 38, 222, 17);
		panel.add(lblNewLabel_1);
		
		JLabel LogoUni = new JLabel("");
		LogoUni.setIcon(new ImageIcon(Presentacion.class.getResource("/Image/UNI.png")));
		LogoUni.setBounds(101, 11, 102, 66);
		panel.add(LogoUni);
		
		JLabel lblNewLabel_4 = new JLabel("2m4 CO");
		lblNewLabel_4.setForeground(new Color(0, 0, 139));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4.setBounds(559, 34, 58, 23);
		panel.add(lblNewLabel_4);
	}
	protected void doBtnMenuActionPerformed(ActionEvent e) 
	{
		this.setVisible(false);
		LabsMenu r = new LabsMenu();
		r.setLocationRelativeTo(null);
		r.setVisible(true);
	}
}

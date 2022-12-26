import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class MenuL5 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuL5 frame = new MenuL5();
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
	public MenuL5() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuL5.class.getResource("/Image/UNI.png")));
		setTitle("Laboratorio 5");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 432);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton Presentacion = new JButton("Regresar");
		Presentacion.setBounds(10, 359, 113, 23);
		Presentacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doBtnRegresarActionPerformed(e);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(Presentacion);
		
		JButton Salir = new JButton("Salir");
		Salir.setBounds(531, 359, 108, 23);
		Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(Salir);
		
		JLabel lblNewLabel = new JLabel("Menu de opciones Laboratorio 5");
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD, 18));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(159, 0, 322, 34);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Ejercicio 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ejer1ActionPerformed(e);
			}
		});
		btnNewButton.setBounds(68, 149, 108, 23);
		contentPane.add(btnNewButton);
		
		JButton btnEjercicio = new JButton("Ejercicio 2");
		btnEjercicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ejer2ActionPerformed(e);
			}
		});
		btnEjercicio.setBounds(272, 149, 108, 23);
		contentPane.add(btnEjercicio);
		
		JButton btnNewButton_1_1 = new JButton("Ejercicio 3");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Ejer3ActionPerformed(e);
			}
		});
		btnNewButton_1_1.setBounds(480, 149, 108, 23);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Ejercicio 4");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ejer4ActionPerformed(e);
			}
		});
		btnNewButton_1_2.setBounds(145, 250, 108, 23);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Ejercicio 5");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ejer5ActionPerformed(e);
			}
		});
		btnNewButton_1_3.setBounds(410, 250, 108, 23);
		contentPane.add(btnNewButton_1_3);
		
		JLabel FondoMeL5 = new JLabel("New label");
		FondoMeL5.setIcon(new ImageIcon(MenuL5.class.getResource("/Image/5506731.png")));
		FondoMeL5.setBounds(0, 34, 649, 359);
		contentPane.add(FondoMeL5);
	}
	protected void doBtnRegresarActionPerformed(ActionEvent e) 
	{
		this.setVisible(false);
		LabsMenu r = new LabsMenu();
		r.setLocationRelativeTo(null);
		r.setVisible(true);
	}
	protected void Ejer1ActionPerformed(ActionEvent e) 
	{
		this.setVisible(false);
		L5E1 r = new L5E1();
		r.setLocationRelativeTo(null);
		r.setVisible(true);
	}
	protected void Ejer2ActionPerformed(ActionEvent e) 
	{
		this.setVisible(false);
		L5E2 r = new L5E2();
		r.setLocationRelativeTo(null);
		r.setVisible(true);
	}
	/*protected void Ejer3ActionPerformed(ActionEvent e) 
	{
		this.setVisible(false);
		L5E3 r = new L5E3();
		r.setLocationRelativeTo(null);
		r.setVisible(true);
	}*/
	protected void Ejer4ActionPerformed(ActionEvent e) 
	{
		this.setVisible(false);
		L5E4 r = new L5E4();
		r.setLocationRelativeTo(null);
		r.setVisible(true);
	}
	protected void Ejer5ActionPerformed(ActionEvent e) 
	{
		this.setVisible(false);
		L5E5 r = new L5E5();
		r.setLocationRelativeTo(null);
		r.setVisible(true);
	}

}

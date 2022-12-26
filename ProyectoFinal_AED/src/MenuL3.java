import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class MenuL3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuL3 frame = new MenuL3();
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
	public MenuL3() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuL3.class.getResource("/Image/UNI.png")));
		setTitle("Laboratorio 3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 424);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 51, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMenuDeOpciones = new JLabel("Menu de opciones laboratorio 3");
		lblMenuDeOpciones.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuDeOpciones.setForeground(Color.WHITE);
		lblMenuDeOpciones.setFont(new Font("Stencil", Font.BOLD, 18));
		lblMenuDeOpciones.setBackground(Color.BLACK);
		lblMenuDeOpciones.setBounds(138, 8, 335, 36);
		contentPane.add(lblMenuDeOpciones);
		
		JButton L3E1 = new JButton("Ejercicio 1");
		L3E1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ejer1ActionPerformed(e);
			}
		});
		L3E1.setBounds(37, 144, 107, 23);
		contentPane.add(L3E1);
		
		JButton L3E2 = new JButton("Ejercicio 2");
		L3E2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ejer2ActionPerformed(e);
			}
		});
		L3E2.setBounds(260, 85, 107, 23);
		contentPane.add(L3E2);
		
		JButton L3E3 = new JButton("Ejercicio 3");
		L3E3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ejer3ActionPerformed(e);
			}
		});
		L3E3.setBounds(468, 144, 107, 23);
		contentPane.add(L3E3);
		
		JButton L3E4 = new JButton("Ejercicio 4");
		L3E4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ejer4ActionPerformed(e);
			}
		});
		L3E4.setBounds(37, 235, 107, 23);
		contentPane.add(L3E4);
		
		JButton L3E5 = new JButton("Ejercicio 5");
		L3E5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ejer5ActionPerformed(e);
			}
		});
		L3E5.setBounds(260, 314, 107, 23);
		contentPane.add(L3E5);
		
		JButton L3E6 = new JButton("Ejercicio 6");
		L3E6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ejer6ActionPerformed(e);
			}
		});
		L3E6.setBounds(468, 235, 107, 23);
		contentPane.add(L3E6);
		
		JButton Regresar = new JButton("Regresar");
		Regresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doBtnRegresarActionPerformed(e);
			}
		});
		Regresar.setBounds(10, 351, 107, 23);
		contentPane.add(Regresar);
		
		JButton Salir = new JButton("Salir");
		Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		Salir.setBounds(514, 351, 97, 23);
		contentPane.add(Salir);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(MenuL3.class.getResource("/Image/HD-wallpaper-fractal-art-black-mathematics.jpg")));
		lblNewLabel.setBounds(0, 45, 621, 340);
		contentPane.add(lblNewLabel);
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
		L3E1 r = new L3E1();
		r.setLocationRelativeTo(null);
		r.setVisible(true);
	}
	protected void Ejer2ActionPerformed(ActionEvent e) 
	{
		this.setVisible(false);
		L3E2 r = new L3E2();
		r.setLocationRelativeTo(null);
		r.setVisible(true);
	}
	protected void Ejer3ActionPerformed(ActionEvent e) 
	{
		this.setVisible(false);
		L3E3 r = new L3E3();
		r.setLocationRelativeTo(null);
		r.setVisible(true);
	}
	protected void Ejer4ActionPerformed(ActionEvent e) 
	{
		this.setVisible(false);
		L3E4 r = new L3E4();
		r.setLocationRelativeTo(null);
		r.setVisible(true);
	}
	protected void Ejer5ActionPerformed(ActionEvent e) 
	{
		this.setVisible(false);
		L3E5 r = new L3E5();
		r.setLocationRelativeTo(null);
		r.setVisible(true);
	}
	protected void Ejer6ActionPerformed(ActionEvent e) 
	{
		this.setVisible(false);
		L3E6 r = new L3E6();
		r.setLocationRelativeTo(null);
		r.setVisible(true);
	}

}
